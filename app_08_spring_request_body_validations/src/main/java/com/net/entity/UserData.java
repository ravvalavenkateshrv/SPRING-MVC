package com.net.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class UserData {
	
	

	    @Id
	    @NotBlank(message = "Email ID cannot be blank")
	    @Email(message = "Invalid email format")
	    private String emailId;

	    @NotBlank(message = "First name cannot be blank")
	    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
	    private String firstName;

	    @Size(max = 50, message = "Last name can be at most 50 characters")
	    private String lastName;

	    @NotNull(message = "Phone number cannot be null")
	    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be a valid 10-digit Indian number")
	    private String phoneNumber; // Changed to String to keep leading zero if any

	    @NotBlank(message = "Address cannot be blank")
	    @Size(min = 5, max = 200, message = "Address must be between 5 and 200 characters")
	    private String address;

	    @NotNull(message = "Pincode cannot be null")
	    @Min(value = 100000, message = "Pincode must be at least 6 digits")
	    @Max(value = 999999, message = "Pincode cannot be more than 6 digits")
	    private Integer pincode;
	}
