package com.project.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.UserAccess;

@Repository
public interface UserAccessRepository extends CrudRepository<UserAccess, Long> {
	Optional  <UserAccess> findByUsername(String username);
}
