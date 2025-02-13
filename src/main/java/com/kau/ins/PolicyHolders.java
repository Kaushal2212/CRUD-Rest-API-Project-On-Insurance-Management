package com.kau.ins;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.JoinColumn;

@Entity
public class PolicyHolders {
	@Id
	private int id;
	@NotBlank(message="Name Is Required.")
	private String name;
	@Min(message="Policyholder Must Be Atleast 18 Years Old.", value = 18)
	private int age;
	@Email(message="Invalid Email.")
	private String email;
	@NotNull(message="Mobile Number Is Required.")
	private long mobileno;
	@ManyToMany
	@JoinTable(name="insurance_details",
				joinColumns= @JoinColumn(name="policyholder_id"),
				inverseJoinColumns=@JoinColumn(name="policies_id"))
	private List<Policies> policies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public List<Policies> getPolicies() {
		return policies;
	}
	public void setPolicies(List<Policies> policies) {
		this.policies = policies;
	}
	

}
