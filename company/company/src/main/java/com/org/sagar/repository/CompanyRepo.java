package com.org.sagar.repository;

import com.org.sagar.model.CompanyDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends MongoRepository<CompanyDetails,Integer> {

}
