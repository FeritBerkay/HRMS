package kodlama.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.HRMS.business.abstracts.LinkService;
import kodlama.HRMS.entities.concretes.Link;

@RestController
@RequestMapping("/api/links")
public class LinksController {

	private LinkService linkService;

	@Autowired
	public LinksController(LinkService linkService) {
		super();
		this.linkService = linkService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Link link )
    {
        return ResponseEntity.ok(this.linkService.add(link));
    }
    
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        
        return ResponseEntity.ok(this.linkService.getAll());
    }
	
}
