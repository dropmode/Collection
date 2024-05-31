package practice;

import java.time.LocalDate;

public class Task {
	private LocalDate date;
	private String task;

	public Task(LocalDate date, String task) {
		date = this.date;
		task = this.task;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

}
