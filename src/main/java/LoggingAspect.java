import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Pointcut("execution(* *.logEvent(..))")
    public void allLogEventMethods() {

    }

    @Before("allLogEventMethods()")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("BEFORE : " +
                joinPoint.getTarget()
                        .getClass().getSimpleName()
                + " " +
                joinPoint.getSignature().getName());

    }


    @AfterThrowing(pointcut = "allLogEventMethods()", throwing = "ex")
    public void logAfterThrow(Throwable ex) {
        System.out.println("AFTER_THR: " + ex);
    }



}
