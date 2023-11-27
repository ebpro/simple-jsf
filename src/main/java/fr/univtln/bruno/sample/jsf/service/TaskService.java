package fr.univtln.bruno.sample.jsf.service;

import fr.univtln.bruno.sample.jsf.repository.Task;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import fr.univtln.bruno.sample.jsf.repository.TaskDAO;

import java.io.Serializable;
import java.util.List;

@Named
public class TaskService implements Serializable {
    @Inject
    TaskDAO taskDAO;

    public void add(Task task) {
        taskDAO.add(task);
    }

    public List<Task> findAll() {
        return taskDAO.findAll();
    }
}
