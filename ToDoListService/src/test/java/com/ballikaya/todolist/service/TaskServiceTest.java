package com.ballikaya.todolist.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ballikaya.todolist.model.Task;
import com.ballikaya.todolist.model.User;
import com.ballikaya.todolist.service.config.Config;
import com.ballikaya.todolist.service.config.TestConfig;
import com.ballikaya.todolist.service.service.TaskService;

@ContextConfiguration(classes = { Config.class, TestConfig.class })
@ActiveProfiles("test")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class TaskServiceTest {

	@Autowired
	TaskService taskServiceService;

	@Test
	public void saveAndRemove() {

		Task task = new Task(1L, "test", "test");

		Task savedTask = taskServiceService.saveTask(task);
		if (savedTask == null)
			assert (false);

		taskServiceService.delete(savedTask.getId());

		assert (true);
	}

	@Test
	public void getTask() {
		
		Task task = new Task(1L, "test", "test");

		Task savedTask = taskServiceService.saveTask(task);
		if (savedTask == null)
			assert (false);


		Task taskToFetch = taskServiceService.getTaskById(savedTask.getId());
		
		if (taskToFetch == null)
			assert (false);
		
		taskServiceService.delete(savedTask.getId());

		assertNotNull(taskToFetch);
	}

}
