package com.hstn.valid;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Client {

    private String firstName;

    @NotNull()
    @Size(min = 2, max = 100, message = "Enter correct last name. Min 2 symbol, max 100 symbol.")
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
