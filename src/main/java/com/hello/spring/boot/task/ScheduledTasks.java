package com.hello.spring.boot.task;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ScheduledTasks {

	@Scheduled(fixedRate = 5000)
	public void createEvent() {
		// TODO: Invoke the repository that will store the event in the database.
		log.info("Event generated [time=%s]".formatted(LocalDateTime.now()));
	}
}