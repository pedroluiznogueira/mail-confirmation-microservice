package com.microservice.mailconfirmation.repository;

import com.microservice.mailconfirmation.model.UsersData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDataRepository extends CrudRepository<UsersData, Long> {

}
