package com.soar.validation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest implements Serializable {

    @NotNull(message = "Please enter a name.")
    private String name;
    @Email(message = "Invalid email entered.")
    private String email;
    @Min(18)
    @Max(60)
    private int age;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile entered.")
    private String mobile;
    private String gender;
    @NotBlank
    private String nationality;
}
