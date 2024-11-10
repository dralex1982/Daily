package telran.daily.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DailyController {
	
	@PostMapping("/create")
	public boolean createTask() {
		return true;
	}

}
