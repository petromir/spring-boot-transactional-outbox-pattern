package com.hello.outbox.pattern.event;

import java.util.UUID;

import com.fasterxml.jackson.databind.JsonNode;

public record BookCreatedEvent(
	UUID id,
	String aggregateType,
	String aggregateId,
	String type,
	JsonNode payload
) implements OutboxEvent<String, JsonNode>{}
