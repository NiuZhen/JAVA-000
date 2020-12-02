package com.geektime.springbootdemo.aop;

import com.geektime.springbootdemo.bean.DBContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @since 2020/12/2 11:12
 */
@Aspect
@Component
public class DatasourceAop {
    /**
     * 只读：
     * 不是Master注解的对象或方法  && select开头的方法  ||  get开头的方法
     * !@annotation(com.geektime.springbootdemo.annotation.Master) " +
     *             "&&
     */
    @Pointcut("(execution(* com.geektime.springbootdemo.services..*.select*(..)) " +
            "|| execution(* com.geektime.springbootdemo.services..*.get*(..)))")
    public void readPointcut() {

    }

    /**
     * 写：
     * Master注解的对象或方法 || insert开头的方法  ||  add开头的方法 || update开头的方法
     * || edlt开头的方法 || delete开头的方法 || remove开头的方法
     * annotation(com.geektime.springbootdemo.annotation.Master) " +
     *             "||
     */
    @Pointcut("execution(* com.geektime.springbootdemo.services..*.insert*(..)) " +
            "|| execution(* com.geektime.springbootdemo.services..*.add*(..)) " +
            "|| execution(* com.geektime.springbootdemo.services..*.update*(..)) " +
            "|| execution(* com.geektime.springbootdemo.services..*.edit*(..)) " +
            "|| execution(* com.geektime.springbootdemo.services..*.delete*(..)) " +
            "|| execution(* com.geektime.springbootdemo..*.remove*(..))")
    public void writePointcut() {

    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }
}
