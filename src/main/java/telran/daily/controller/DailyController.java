package telran.daily.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.daily.dto.TaskDto;
import telran.daily.service.DailyService;

@RestController
public class DailyController {
	
	@Autowired
	DailyService dailyService;
	
	@PostMapping("/createTask")
	public boolean createTask(@RequestBody TaskDto taskDto) {
		dailyService.createTask(taskDto);
		return true;
	}

}
