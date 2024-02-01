package com.hello.outbox.pattern.event;

import java.util.UUID;

import com.fasterxml.jackson.databind.JsonNode;

public interface OutboxEvent<ID, PAYLOAD_TYPE> {
	UUID id();
	String aggregateType();
	String aggregateId();
	String type();
	JsonNode payload();
}
