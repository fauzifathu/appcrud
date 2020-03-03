package com.crud.demo.springdatajpa.model;

import javax.persistence.*;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity @Table(name="app_user")
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "join_date")
    private Date joinDate;

    @Override
    public String toString() {
        return String.format(""
                        + "AppUser[id=%d, username=%s, firstName=%s, LastName=%s, joinDate=%tD]",
                        id, username, firstName, lastName, joinDate);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getJoinDate() {
        return joinDate;
    }


    // Anotasi @Entity menandakan kalau class termasuk JPA Entity
    // Anotasi @Table(name="AppUser") merupakan class di mapping ke table app_user

    //@entity harus mempunya primary key.

    // Setter & Getter
}
