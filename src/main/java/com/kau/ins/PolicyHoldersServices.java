package com.kau.ins;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyHoldersServices extends JpaRepository<PolicyHolders,Integer> {

}

@Repository
interface PoliciesServices extends JpaRepository<Policies,Integer> {
	
}
