package com.belejki.backend.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name = "enabled")
    public boolean enabled;
    @Column(name = "is_set_for_deletion")
    public boolean isSetForDeletion;
    @Column(name = "last_login")
    public LocalDate lastLogin;
    @Column(name = "email")
    public String email;
    @Column(name = "password")
    public String password;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    @Column(name = "role_id")
    public int roleId;
    @Column(name = "created_on")
    private LocalDate createdOn;

    public User() {
    }

    public User(String email, boolean enabled, String first_name,
                boolean is_set_for_deletion, LocalDate last_login,
                String last_name, String password, int roleId, LocalDate createdOn) {
        this.email = email;
        this.enabled = enabled;
        this.firstName = first_name;
        this.isSetForDeletion = is_set_for_deletion;
        this.lastLogin = last_login;
        this.lastName = last_name;
        this.password = password;
        this.roleId = roleId;
        this.createdOn = createdOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isSetForDeletion() {
        return isSetForDeletion;
    }

    public void setSetForDeletion(boolean setForDeletion) {
        this.isSetForDeletion = setForDeletion;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", enabled=" + enabled +
                ", isSetForDeletion=" + isSetForDeletion +
                ", lastLogin=" + lastLogin +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
