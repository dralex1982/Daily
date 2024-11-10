package telran.daily.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.daily.dto.TaskDto;

@RestController
public class DailyController {
	
	@PostMapping("/createTask")
	public boolean createTask(@RequestBody TaskDto taskDto) {
		System.out.println(taskDto);
		return true;
	}

}
