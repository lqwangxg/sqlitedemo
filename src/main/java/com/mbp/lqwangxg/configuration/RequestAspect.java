package com.mbp.lqwangxg.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 
 * @author wangzhuo
 * リクエストのaspect
 *
 */
@Aspect
@Component
@Slf4j
public class RequestAspect {

	private long startime = 0;
	private long endtime;
	/*@Before注解表示在具体的方法之前执行*/
	@Before("destination()")
	public void before(JoinPoint point) throws Throwable {
		log.debug("---Before aspect--->>>---");
		startime = System.currentTimeMillis();
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		if(attributes==null){
			return;
		}
		HttpServletRequest request = attributes.getRequest();
		String requestURI = request.getRequestURI();
		String remoteAddr = request.getRemoteAddr();
		String requestMethod = request.getMethod();
		String declaringTypeName = point.getSignature().getDeclaringTypeName();
		String methodName = point.getSignature().getName();
		Object[] args = point.getArgs();
		log.debug("url={},ip={},method={},class={},args={}" ,
				requestURI , remoteAddr , requestMethod ,declaringTypeName, methodName,args);
	}

	/*@PointCut注解表示表示横切点，哪些方法需要被横切*/
	/*切点表达式*/
	@Pointcut("execution(* com.mbp.lqwangxg.controller..*.*(..))")
	/*切点签名*/
	public void destination() {
	}

	/*@After注解表示在方法执行之后执行*/
	@After("destination()")
	public void after() {
		endtime = System.currentTimeMillis() - startime;
		log.debug("---after aspect----<<<---");
	}
	/*@AfterReturning注解用于获取方法的返回值*/
	@AfterReturning(pointcut = "destination()", returning = "object")
	public void getAfterReturn(Object object) {
		if(object==null){
			return;
		}
		log.debug("cost times:{}ms, afterReturn:{}", endtime, object);
	}

	/*private String getTimeLogString(ProceedingJoinPoint pjp) throws Throwable{
		long timefilter = (System.currentTimeMillis() - startime);
		StringBuilder sbLog = new StringBuilder();
		sbLog.append(" 実行時間:" + timefilter + "ms");
		
		Signature sig = pjp.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("@Aspect アノテーションはメソッドしか利用できません。");
        }
        msig = (MethodSignature) sig;
        Object target = pjp.getTarget();
		sbLog.append(" ClassName:" + target.getClass());
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        sbLog.append(" MethodName:" + currentMethod.getName());
        
		Object[] args = pjp.getArgs();
		sbLog.append(" ParamList:" );
		for (Object arg : args) {
			sbLog.append(arg);
		}
		return sbLog.toString();
	}*/
}
