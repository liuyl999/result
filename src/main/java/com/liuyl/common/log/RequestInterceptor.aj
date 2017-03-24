package com.liuyl.common.log;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by liuyl on 2017-3-24.
 */
@Aspect
@Component
public class RequestInterceptor {

    private static final Logger log = LogManager.getLogger(RequestInterceptor.class);

    /**
     * @Author: liuyl
     * @Decription:
     * @Date: 14:25 2017-3-24
    */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void getRequestMappingMethods() {

    }

    @Around("getRequestMappingMethods()")
    public Object interceptorAction(ProceedingJoinPoint pjp) {
        Object o = null;
        log.info("fsafsaf");
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            //记录错误
            log.error(throwable.getMessage(), throwable);
            //获取方法返回类型
            MethodSignature joinPointObject = (MethodSignature) pjp.getSignature();
            Method method = joinPointObject.getMethod();
            //可以在此进行错误跳转页面
        }
        return o;
    }

}
