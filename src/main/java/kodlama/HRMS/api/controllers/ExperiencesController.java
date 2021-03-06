package kodlama.HRMS.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.ExperienceService;
import kodlama.HRMS.entities.concretes.Experience;



@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {

	private ExperienceService experienceService;
	
	@Autowired
	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}

	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Experience experience )
    {
        return ResponseEntity.ok(this.experienceService.add(experience));
    }
    
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        
        return ResponseEntity.ok(this.experienceService.getAll());
    }
}
