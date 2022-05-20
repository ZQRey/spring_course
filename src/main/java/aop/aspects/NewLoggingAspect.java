package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.err.println("aroundReturnBookLoggingAdvice: В библиотеку пытыются вернуть книгу");

        Object targetMethodResult = null;
        try{
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e){
            System.err.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
            throw e;
        }


        System.err.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книгу");
        return targetMethodResult;
    }
}
