package fr.univtln.bruno.sample.jsf.view.controllers;

import fr.univtln.bruno.sample.jsf.repository.Task;
import fr.univtln.bruno.sample.jsf.service.TaskService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@ViewScoped
@Named
@Getter
@Setter
public class TaskView implements Serializable {
    private String title;
    private int importance;

    @Inject
    private TaskService taskService;

    public String add() {
        Task task = Task.of(title, importance);
        taskService.add(task);
        return "tasksTable";
    }

    public List<Task> findAll() {
        return getTaskService().findAll();
    }
}