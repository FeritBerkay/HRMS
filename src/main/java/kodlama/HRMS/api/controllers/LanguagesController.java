package kodlama.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.LanguageService;
import kodlama.HRMS.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
     @Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
     
     @PostMapping("/add")
     public ResponseEntity<?> add(@RequestBody  Language language )
     {
         return ResponseEntity.ok(this.languageService.add(language));
     }
     
     @GetMapping("/getall")
     public ResponseEntity<?> getAll(){
         
         return ResponseEntity.ok(this.languageService.getAll());
     }
}