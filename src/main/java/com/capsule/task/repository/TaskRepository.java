package com.capsule.task.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capsule.task.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
