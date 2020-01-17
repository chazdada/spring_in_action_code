package com.chazdada;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(* com.chazdada.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("silence Cell Phone!");
    }

    @Before("execution(* com.chazdada.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("take Seats");

    }

    @AfterReturning("execution(* com.chazdada.Performance.perform(..))")
    public void applause(){
        System.out.println("clap clap");
    }
    @AfterThrowing("execution(* com.chazdada.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("demand refund");
    }

}
