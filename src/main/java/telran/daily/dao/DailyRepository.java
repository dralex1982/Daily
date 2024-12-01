package telran.daily.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.daily.model.Task;

public interface DailyRepository extends JpaRepository<Task, Long> {
	

}
