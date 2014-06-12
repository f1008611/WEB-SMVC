package com.slin.smvc.interceptor;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 14-6-12.
 */
public class ApiInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        writeLog(logger, request);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }

    private void writeLog(Logger logger, HttpServletRequest request) {
        String ip = request.getRemoteAddr();
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String userAgent = request.getHeader("user-agent");
        if (StringUtils.isEmpty(userAgent)) {
            userAgent = "UNKNOWN";
        }
        String link = request.getRequestURI() + ((request.getQueryString() != null) ? "?" + request.getQueryString() : "");
        String log = ip + "\t" + date + "\t" + link + "\t" + userAgent;
        logger.info(log);
    }

}
