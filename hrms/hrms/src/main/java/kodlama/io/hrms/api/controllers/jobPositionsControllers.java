package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.jobPositionsService;
import kodlama.io.hrms.entities.concretes.jobPositions;

@RestController
@RequestMapping("/api/jobpositions")
public class jobPositionsControllers {

	private jobPositionsService jobpositionsService;

	@Autowired
	public jobPositionsControllers(jobPositionsService jobpositionsService) {
		super();
		this.jobpositionsService = jobpositionsService;
	}

	@GetMapping("/getall")
	public List<jobPositions> getAll() {
		return this.jobpositionsService.getAll();	
	}

}
