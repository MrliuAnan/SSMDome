package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by 刘安 on 2017/9/6.
 */
public class LogAOP {
    Logger logger=Logger.getLogger(LogAOP.class);

    //要记录的日志内容
    String strLog=null;

    //前置通知
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入了前置通知");
        strLog="log Begining method: "
                 +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
    //后置通知
    public void somethingAfter(JoinPoint joinPoint){
        System.out.println("进入了后置通知");
        strLog="log Begining method: "
                +joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);

    }
    //环绕通知
    public Object somethingAround(ProceedingJoinPoint pjq)throws Throwable{
        //获取当前系统时间
        long start =System.currentTimeMillis();
        Object retVal=pjq.proceed();//执行这个方法
        long end =System.currentTimeMillis();
        logger.info("该方法执行了: "+ (end-start)+" ms");
        return retVal;

    }
}
