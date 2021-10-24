package com.example.keybooter;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Long>
{
}
