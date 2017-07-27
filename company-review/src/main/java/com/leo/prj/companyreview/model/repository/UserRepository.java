package com.leo.prj.companyreview.model.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.leo.prj.companyreview.model.entity.node.UserEntity;

@Repository
public interface UserRepository extends GraphRepository<UserEntity> {

	UserEntity findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}