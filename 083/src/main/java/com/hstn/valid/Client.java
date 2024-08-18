package com.hstn.valid;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Client {

    private String firstName;

    @NotNull(message = "Enter last name.")
    @Size(min = 2, max = 100,  message = "Enter correct last name.")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
