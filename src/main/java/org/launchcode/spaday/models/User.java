package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Calendar;

public class User {

    private int id;
    private int nextID =1;
    @NotBlank(message = "username is required")
    @Size(min = 3, max = 50)
    private String username;
    @Email(message = "Invalid Email. try againm")
    private String email;
    @NotBlank
    @Size(min = 3, max = 50)
    private String password;
    private final Calendar timeCreated;
    public User(){
        id = nextID;
        nextID++;
        this.timeCreated = Calendar.getInstance();
    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public Calendar getTimeCreated() {
        return timeCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
