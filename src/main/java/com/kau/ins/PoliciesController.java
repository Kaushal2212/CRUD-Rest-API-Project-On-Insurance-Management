package com.kau.ins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class PoliciesController {
	@Autowired
	PoliciesServices ps;
	
	@PostMapping
	public Policies createpolicy(@RequestBody Policies pl) {
		return ps.save(pl);
	}
	
	@GetMapping
	public List<Policies> getPolicies() {
		return ps.findAll();
	}
	
	@GetMapping("/{id}")
	public Policies getpolicy(@PathVariable Integer id) {
		return ps.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Policies updatepolicy(@PathVariable Integer id,@RequestBody Policies pl) {
		ps.deleteById(id);
		return ps.save(pl);
	}
	
	
	@DeleteMapping("/{id}")
	public void  deletepolicy(@PathVariable Integer id) {
		ps.deleteById(id);
	}
	
	

}
