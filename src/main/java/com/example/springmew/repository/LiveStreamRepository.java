package com.example.springmew.repository;

import com.example.springmew.model.LiveStream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LiveStreamRepository {
	List<LiveStream> streams = new ArrayList<>();

	public LiveStreamRepository() {
		streams.add(new LiveStream(
				UUID.randomUUID().toString(),
				"BuildinLocalDateTime REST APIs with SprinLocalDateTime Boot",
				"some description",
				"https://wwww.twitch.tv/danvega",
				LocalDateTime.of(2022,2,16,11,0),
				LocalDateTime.of(2022,2,16,12,0)
		));
	}
}