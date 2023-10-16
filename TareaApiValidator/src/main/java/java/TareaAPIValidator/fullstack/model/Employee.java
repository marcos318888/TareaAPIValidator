package java.TareaAPIValidator.fullstack.model; //se suelen poner domain o model

import edu.cesur.fullstack.validators.CodeValidation;
import edu.cesur.fullstack.validators.OnCreate;
import edu.cesur.fullstack.validators.OnUpdate;
import edu.cesur.fullstack.validators.ValidPersonCode;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.UUID;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {
    @UUID
    @Generated(value = { "" })
    @jakarta.validation.constraints.Positive
    private Long id;

    @jakarta.validation.constraints.NotEmpty
    private String name;

    @Email
    private String email;

    @jakarta.validation.constraints.Pattern(regexp = "EMP-[a-zA-Z]{3}-\\d{4}")
    private String employeeCode;

	public Employee(@UUID @jakarta.validation.constraints.Positive Long id,
			@jakarta.validation.constraints.NotEmpty String name, @jakarta.validation.constraints.Email String email,
			@jakarta.validation.constraints.Pattern(regexp = "EMP-[a-zA-Z]{3}-\\d{4}") String employeeCode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.employeeCode = employeeCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", employeeCode=" + employeeCode + "]";
	}


	
		
	}

 

