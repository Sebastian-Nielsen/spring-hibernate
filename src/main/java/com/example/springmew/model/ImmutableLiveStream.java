package com.example.springmew.model;

import java.time.LocalDateTime;

public class ImmutableLiveStream {
	private final String id;
	private final String title;
	private final String description;
	private final String url;
	private final LocalDateTime startDate;
	private final LocalDateTime endDate;

	public ImmutableLiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.url = url;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}
}
