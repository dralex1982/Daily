package telran.daily.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.daily.model.TaskEntity;

public interface DailyRepository extends JpaRepository<TaskEntity, Long> {
	

}
