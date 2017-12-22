package com.sample.app.service;

import java.util.stream.Stream;

import com.sample.app.model.UserDetail;

public interface SampleService {
	public Stream<UserDetail> getAll();
}