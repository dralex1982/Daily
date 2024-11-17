package telran.daily.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class TaskDto {
	String title;
	String description;
	
	@JsonProperty("completed date")
	String completedDate;

}
