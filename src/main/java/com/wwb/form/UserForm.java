package com.wwb.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserForm {

    @NotNull
    @Size(min = 5,max = 16)
    private String username;

    @NotNull
    @Size(min = 5,max = 25)
    private String password;

    @NotNull
    @Size(min = 2,max = 30)
    private String firstName;

    @NotNull
    @Size(min = 2,max = 30)
    private String lastName;
}
