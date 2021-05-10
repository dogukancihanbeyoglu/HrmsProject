package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.jobsService;
import kodlamaio.hrms.entities.concretes.jobTitles;

@RestController
@RequestMapping("/api/jobs")
public class jobsController {
	
	private jobsService jobsService;

	public jobsController(jobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	@GetMapping("/getall")
	public List<jobTitles> getAll(){ 
		return this.jobsService.getAll();
	}
	
}
