package com.kau.ins;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Policies {
	@Id
	private int pId;
	@NotBlank(message="Policy Name Is Required.")
	private String pName;
	@NotNull(message="Duration Is Required.")
	private int pDuration;
	@ManyToMany(mappedBy="policies")
	private List<PolicyHolders> policyholders;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpDuration() {
		return pDuration;
	}
	public void setpDuration(int pDuration) {
		this.pDuration = pDuration;
	}
	public List<PolicyHolders> getPolicyholders() {
		return policyholders;
	}
	public void setPolicyholders(List<PolicyHolders> policyholders) {
		this.policyholders = policyholders;
	}
	

}
