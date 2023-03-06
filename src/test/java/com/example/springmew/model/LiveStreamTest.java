package com.example.springmew.model;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LiveStreamTest {

	@Test
	void create_new_mutable_live_stream() {
		MutableLiveStream stream = new MutableLiveStream();
		stream.setId(UUID.randomUUID().toString());
		stream.setTitle("BuildinLocalDateTime REST APIs with SprinLocalDateTime Boot");
		stream.setDescription("");
		stream.setUrl("https://wwww.twitch.tv/danvega");
		assertNotNull(stream);
//		assertEquals("BuildinLocalDateTime REST APIs with SprinLocalDateTime Boot", stream.LocalDateTimeTitle, "");
	}

}