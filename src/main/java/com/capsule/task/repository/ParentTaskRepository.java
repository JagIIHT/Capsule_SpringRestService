package com.capsule.task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capsule.task.model.Parent;

@Repository
public interface ParentTaskRepository extends CrudRepository<Parent, Integer> {

}
