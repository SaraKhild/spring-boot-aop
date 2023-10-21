package com.example.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.springbootaop.model.Employee;

@Aspect
@Component
public class EmployeeAspect {

    @Pointcut("within(@org.springframework.stereotype.Service *)"
            + "|| within(@org.springframework.stereotype.Repository *)"
            + "|| within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {
    }

    @Before("springBeanPointcut()")
    public void allMethodPointcut(JoinPoint joinPoint) {
        System.out.println("All method Pointcut:" + joinPoint.getSignature());
    }

    @Before(value = "execution(* com.example.springbootaop.service.EmployeeServiceImpl.createEmployee(..))"
            + "&& args(employee)")
    public void beforeCreateEmpoyee(JoinPoint joinPoint, Employee employee) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Create employee:" + employee.getName() + "-" + employee.getPhone());
    }

    @AfterReturning(pointcut = "execution(* com.example.springbootaop.service.EmployeeServiceImpl.createEmployee(..))", returning = "employee")
    public void afterCreateEmpoyee(JoinPoint joinPoint, Employee employee) {
        System.out.println("After Returning method:" + joinPoint.getSignature());
        System.out.println("Successfully created Employee:" + employee.getName() + "-" + employee.getPhone());
    }

    @After(value = "execution(* com.example.springbootaop.service.EmployeeService.fetchAllEmployee())")
    public void afterFetchAllEmployee(JoinPoint joinPoint) {
        System.out.println("After method:" + joinPoint.getSignature());
    }

    @Around(value = "execution(* com.example.springbootaop.service.EmployeeService.*())")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Around Employee Service");
        try {
            System.out.println("Proceeding Join Point:" + proceedingJoinPoint.proceed());
        } catch (Throwable e) {
            System.out.println("Throwable:" + e);
        }
    }

}
