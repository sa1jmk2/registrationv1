package com.api.paylode;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {

    @NotEmpty
    @Size(min=2,message = "Min Should be 2 Letters" )
      private String name;

      @Email
       private String email;

      @Size(min =10 ,max = 10,message = "Should be 10 digits")
      private String mobile;


}