package registrationapi;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {

	@NotBlank(message = "Name must not be empty")
	private String name;
	
	@NotBlank(message = "Email must not be empty")
	@Email(message = "Email is not valid")
	private String email;
	
	@Min(value = 18, message = "Age must be between 18 and 30")
	@Max(value = 30, message = "Age must be between 18 and 30")
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
