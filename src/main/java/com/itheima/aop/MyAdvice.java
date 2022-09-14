//package com.itheima.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//@Aspect
//public class MyAdvice {
//    @Pointcut("execution(* com.itheima.dao.BookDao.findName(..))")
//    private void pt(){}
//    @Before("pt()")
//   public void Before(JoinPoint jp){
//        Object[] ret= jp.getArgs();
//        System.out.println(Arrays.toString(ret));
//        System.out.println("Before");
//   }
//    @Around("pt()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable{
//        Object[] args= pjp.getArgs();
//        args[0]=666;
//        return pjp.proceed(args);
//
//    }
//    @AfterReturning(value = "pt()",returning = "ret")
//    public void afterReturning(JoinPoint jp,Object ret){
//        System.out.println("After:"+ret);
//    }
//    @AfterThrowing(value = "pt()",throwing = "t")
//    public void afterThrowing(Throwable t){
//        System.out.println("throwing");
//    }
//}
