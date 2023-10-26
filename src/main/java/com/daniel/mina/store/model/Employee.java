package com.daniel.mina.store.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Employee implements Serializable {
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

    public String getJobTile() {
        return jobTile;
    }

    public void setJobTile(String jobTile) {
        this.jobTile = jobTile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTile='" + jobTile + '\'' +
                ", phone='" + phone + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private  String name;

    public Employee(Long id, String name, String email, String jobTile, String phone, String imageURL, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTile = jobTile;
        this.phone = phone;
        this.imageURL = imageURL;
        this.employeeCode = employeeCode;
    }

    private  String email;
    private  String jobTile;
    private  String phone;
    private  String imageURL;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

}
