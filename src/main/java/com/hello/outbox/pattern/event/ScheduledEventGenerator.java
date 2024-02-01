package com.hello.outbox.pattern.event;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.hello.outbox.pattern.entity.Book;
import com.hello.outbox.pattern.repository.BookRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class ScheduledEventGenerator {

	private final BookRepository bookRepository;

	private final Faker faker = new Faker();

	@Scheduled(fixedRate = 3000)
	public void createEvent() {
		final Book book = new Book(faker.book().title(),
				faker.book().author(),
				faker.code().isbn10(),
				BigDecimal.valueOf(faker.number().randomDouble(2, 0, 100)),
				LocalDate.now());
		final Book savedBook = bookRepository.save(book);
		// TODO: Create an outbox event
		log.info("Event generated [data=%s, at=%s]".formatted(savedBook, LocalDateTime.now()));
	}
}