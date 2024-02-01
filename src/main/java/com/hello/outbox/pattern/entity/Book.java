package com.hello.outbox.pattern.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public record Book(
		@Id
		Long id,
		String title,
		String author,
		String isbn,
		BigDecimal price,
		LocalDate publishedDate
) {
	public Book(final String title,
			final String author,
			final String isbn,
			final BigDecimal price,
			final LocalDate publishedDate) {
		this(null, title, author, isbn, price, publishedDate);
	}
}
