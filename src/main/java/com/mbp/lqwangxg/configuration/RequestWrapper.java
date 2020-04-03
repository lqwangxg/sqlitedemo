package com.mbp.lqwangxg.configuration;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/** 
 *  
 * @author  
 * 流的方式获取JSON数据
 * HttpServletRequest は一回中身を取ったら、再度取れなくなるため、
 * Wrapperによりバッファーに保存しよう
 */
@Slf4j
public class RequestWrapper extends HttpServletRequestWrapper {
  
    //存放JSON数据主体
    private final String body;
    //private Map<String, String> addHeaders;
    public RequestWrapper(HttpServletRequest request) throws IOException {
        super(request);

        StringBuilder builder = new StringBuilder();

        InputStream is = request.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        char buff[] = new char[ 128 ];
        int length;
        while ((length = reader.read(buff)) > 0) {
            builder.append(buff,0,length);
        }
        body = builder.toString();
        log.debug("==RequestWrapper===========");
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        ServletInputStream servletInputStream = new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return new ByteArrayInputStream(body.getBytes("UTF-8")).read();
            }

            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener) {
                // TODO Auto-generated method stub

            }
        };
        return servletInputStream;
    }

    @Override  
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }
    public String getBody(){
        return this.body;
    }
} 