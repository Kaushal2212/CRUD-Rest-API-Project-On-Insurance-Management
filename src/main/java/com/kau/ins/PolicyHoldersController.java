package com.kau.ins;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/policyholders")
public class PolicyHoldersController {
	@Autowired
	PolicyHoldersServices phs;
	
	@PostMapping
	public PolicyHolders createpolicyholder(@RequestBody PolicyHolders ps) {
		return phs.save(ps);
	}
	
	@GetMapping
	public List<PolicyHolders> getpolicyholders() {
		return phs.findAll();
	}
	
	@GetMapping("/{id}")
	public PolicyHolders getpolicyholder(@PathVariable Integer id) {
		return phs.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}") 
	public PolicyHolders updatepolicyholder(@PathVariable Integer id, @RequestBody PolicyHolders ph) throws Exception {
	   phs.deleteById(id);
	   return phs.save(ph);
	}

	
	@DeleteMapping("/{id}")
	public void deletepolicyholder(@PathVariable Integer id) {
		phs.deleteById(id);
	}
	
	
	
}
