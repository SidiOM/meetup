package com.archan.consulting.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */

@Entity
public class Patient {

    // ======================================
    // =             Attributes             =
    // ======================================
	@Id
	@GeneratedValue
	private int id;
	
    @Column(nullable = false)
    @NotNull
    @Size(min = 5, max = 50)
    private String lastName;
    private String firstName;
    @Column(nullable = false, length = 100)
    @NotNull
    @Size(min = 2, max = 100)
    private String email;
    
   

    // ======================================
    // =            Constructors            =
    // ======================================

    public Patient() {}

	public Patient(String lastName, String firstName, String email) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	// ======================================
    // =         Getters & setters          =
    // ======================================
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("{firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append("}");
        return sb.toString();
    }
}