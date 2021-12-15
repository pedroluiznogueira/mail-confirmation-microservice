package com.microservice.mailconfirmation.repository;

import com.microservice.mailconfirmation.model.UserConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserConfirmationRepository extends JpaRepository<UserConfirmation, Long> {
}
