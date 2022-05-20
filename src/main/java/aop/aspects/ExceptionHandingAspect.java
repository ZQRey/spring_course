package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {
    @Before("aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeGetExceptionHandingAdvice(){
        System.out.println("beforeGetExceptionHandingAdvice: ловим/обрабатываем исключения " +
                "при попытке получить книгу журналов");
        System.out.println("-------------------------------");
    }
}
