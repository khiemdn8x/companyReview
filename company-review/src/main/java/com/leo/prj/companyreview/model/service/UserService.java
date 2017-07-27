package com.leo.prj.companyreview.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.prj.companyreview.model.entity.node.UserEntity;
import com.leo.prj.companyreview.model.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity create(final UserEntity userEntity) {
		UserEntity user = this.userRepository.save(userEntity);
		return user;
	}

	public UserEntity update(final UserEntity userEntity) {
		UserEntity user = this.userRepository.save(userEntity);
		return user;
	}
}
