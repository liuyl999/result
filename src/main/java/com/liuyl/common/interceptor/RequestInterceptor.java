package com.liuyl.common.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author liuyl
 * @Decription
 * @Date 2017-3-24
 */
@Aspect
@Component
public class RequestInterceptor {


    /**
     * @Author: liuyl
     * @Decription:
     * @Date: 14:25 2017-3-24
     */
    @Pointcut(value = "@annotation(com.liuyl.annotation.LogAround)")
    public void getRequestMappingMethods() {

    }

    @Around("getRequestMappingMethods()")
    public Object interceptorAction(ProceedingJoinPoint pjp) {
        System.err.println("aaa");
        Object o = null;
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            MethodSignature joinPointObject = (MethodSignature) pjp.getSignature();
            Method method = joinPointObject.getMethod();
            //可以在此进行错误跳转页面
        }
        return o;
    }
}
