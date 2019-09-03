package com.pipeline.models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class ApplicationUser implements UserDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;

    @Column(unique = true)
    String username;

    String password;
    String firstName;
    String lastName;

    public boolean isAdmin() {
        return isAdmin;
    }

    boolean isAdmin;

    @ManyToOne
    CandidateGroup candidateGroup;

    @ManyToMany
    Set<ScheduledTask> scheduledTasks;



    public long getId() {
        return id;
    }

    //Constructor
    public ApplicationUser () {}

    //Constructor for Candidate Users
    public ApplicationUser (String username, String password, String firstName, String lastName, CandidateGroup candidateGroup) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.candidateGroup = candidateGroup;
        this.isAdmin = false;
    }
    //Constructor for Admin Users
    public ApplicationUser (String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = true;
    }
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
