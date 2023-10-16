package java.TareaAPIValidator.fullstack.validators;

import edu.cesur.fullstack.validators.ValidCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EmployeeCodeValidator implements ConstraintValidator<ValidCode, String> {
    @Override
    public void initialize(ValidCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        // Aquí puedes implementar la lógica de validación personalizada con la expresión regular
        return value.matches("^EMP-[a-zA-Z]{3}-\\d+$");
    }

	public boolean isValid1(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}
}