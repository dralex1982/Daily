package telran.daily.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.daily.dao.DailyRepository;
import telran.daily.dto.TaskDto;
import telran.daily.model.Task;

@Service
@RequiredArgsConstructor
public class DailyServiceImpl implements DailyService {

	final DailyRepository dailyRepository;

	@Override
	public Boolean createTask(TaskDto taskDto) {
		Task task = new Task(taskDto.getTitle(), taskDto.getDescription(),
				LocalDateTime.parse(taskDto.getCompletedDate()));
		task.setId(1L);
		dailyRepository.save(task);

		return null;
	}

}
