package java.TareaAPIValidator.fullstack.validators;

import java.lang.annotation.Retention;

import com.fasterxml.jackson.core.util.RequestPayload;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jakarta.validation.Constraint;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmployeeCodeValidator.class)
public @interface ValidEmployeeCode {
    String message() default "Employee code is not valid";
    Class<?>[] groups() default {};
    Class<? extends RequestPayload>[] payload() default {};
}