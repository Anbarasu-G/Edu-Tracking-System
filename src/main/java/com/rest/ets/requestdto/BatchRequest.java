package com.rest.ets.requestdto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.rest.ets.enums.Subject;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchRequest {
	@NotNull
	private String title;
	private LocalTime beginsAt;
	private LocalTime endsAt;
	private LocalDate startingDate;
	@NotNull
	private List<Subject> subjects;
	
	

}
