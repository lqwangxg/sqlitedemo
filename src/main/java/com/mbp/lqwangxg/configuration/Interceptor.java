package com.mbp.lqwangxg.configuration;

import com.google.gson.Gson;
import com.mbp.lqwangxg.model.base.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interceptor implements HandlerInterceptor {

	private static Logger log = LoggerFactory.getLogger(Interceptor.class);
	private final Gson gson = new Gson();
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

		//httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		//httpServletResponse.setHeader("Cache-Control", "no-cache");

		if(request instanceof RequestWrapper){
			log.debug("Interceptor preHandle body:{}",((RequestWrapper) request).getBody());
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object o, Exception e) throws Exception {
		try {
			// Controllerの返却値を取得
			if (request.getSession().getAttribute("body") instanceof ResponseResult) {
				ResponseResult body = (ResponseResult) request.getSession().getAttribute("body");
				log.debug("URL:{},Return:{}",request.getRequestURI(), gson.toJson(body));
			}
		} catch (Exception ex) {
			log.error("afterCompletion Exception StackTrace:{}", ex.getStackTrace().toString());
		}
	}
}
