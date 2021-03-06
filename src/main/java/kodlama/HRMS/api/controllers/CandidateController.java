package kodlama.HRMS.api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.CandidateService;
import kodlama.HRMS.core.Utilities.DataResult;
import kodlama.HRMS.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

	private CandidateService candidateService;
	@Autowired
	public CandidateController(CandidateService CandidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
}
