package kodlama.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.EmployerService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService employerService;
    
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
}
