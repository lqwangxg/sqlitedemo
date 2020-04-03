package com.mbp.lqwangxg.configuration;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author wangzhuo
 * @Description: HttpServletRequest 切り替えfilter
 */
@Slf4j
@WebFilter("/*") // for all request use RequestFilter and RequestWrapper
public class RequestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // save HttpServletRequest into buffer  by Wrapper
        if(request instanceof HttpServletRequest){
            HttpServletRequest req = (HttpServletRequest)request;
            request = new RequestWrapper(req);
            log.info("==INNER======RequestWrapper================");
        }
        chain.doFilter(request, response);
    }
}
