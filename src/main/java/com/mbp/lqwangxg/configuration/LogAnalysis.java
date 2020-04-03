package com.mbp.lqwangxg.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@SuppressWarnings("rawtypes")
@Slf4j
@ControllerAdvice
public class LogAnalysis implements ResponseBodyAdvice {

	@Override
	public boolean supports(MethodParameter returnType, Class converterType) {
		return true;
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        log.debug("===========   beforeBodyWriteロード開始   ===========");

		// RequestContextHolderでrequestを取得
		RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
		HttpServletRequest httpServletRequest = ((ServletRequestAttributes) attributes).getRequest();

		HttpSession httpSession = httpServletRequest.getSession(true);
		httpSession.setAttribute("body", body);
		log.debug("===========   beforeBodyWriteロード終了   ===========");

		return body;
	}
}
