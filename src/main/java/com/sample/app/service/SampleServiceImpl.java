package com.sample.app.service;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.app.model.UserDetail;
import com.sample.app.repository.SampleRepository;

@Transactional
@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	private SampleRepository sampleRepository;

	@Override
	@Transactional(readOnly = true)
	public Stream<UserDetail> getAll() {
		return sampleRepository.getAll();
	}
}
