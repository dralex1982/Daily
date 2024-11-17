package telran.daily.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.daily.dao.DailyRepository;
import telran.daily.dto.TaskDto;
import telran.daily.model.TaskEntity;

@Service
@RequiredArgsConstructor
public class DailyServiceImpl implements DailyService {

	final DailyRepository dailyRepository;
	@Override
	public Boolean createTask(TaskDto taskDto) {
		TaskEntity task = new TaskEntity(taskDto.getTitle(), taskDto.getDescription(),
				LocalDateTime.parse(taskDto.getCompletedDate()));
		dailyRepository.save(task);
		task.setId(1L);
		return null;
	}

}
