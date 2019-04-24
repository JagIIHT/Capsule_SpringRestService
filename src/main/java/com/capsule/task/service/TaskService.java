package com.capsule.task.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capsule.task.model.Task;

@Service
public interface TaskService {

	List<Task> getAllTasks();

	Task saveTask(Task task);

	Task getTaskById(String id);

	Task endTask(String taskId);
}
