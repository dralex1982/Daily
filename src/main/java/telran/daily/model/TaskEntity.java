package telran.daily.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class TaskEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2859120129249801777L;
	Long id;
	String title;
	String description;
	LocalDateTime completedDate;
	LocalDateTime createdDateTime;
	LocalDateTime updatedDateTime;
}
