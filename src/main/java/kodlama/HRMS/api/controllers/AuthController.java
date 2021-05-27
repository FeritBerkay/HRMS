package kodlama.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.AuthService;
import kodlama.HRMS.core.Utilities.Result;
import kodlama.HRMS.entities.concretes.Candidate;
import kodlama.HRMS.entities.concretes.Employer;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;
	
	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result add(@RequestBody Employer employer,String confirmPass) {
		return this.authService.registerEmployer(employer, confirmPass);
	}
	
	@PostMapping("/registerJobHunter")
	public Result add(@RequestBody Candidate jobHunter,String confirmPass) {
		return this.authService.registerJobHunter(jobHunter, confirmPass);
	}
	
	
}
