package fr.univtln.bruno.sample.jsf.repository;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class TaskDAO {
    private static final List<Task> tasks = new ArrayList<>();

    @PostConstruct
    public void init() {
        tasks.add(Task.of("T1",1));
        tasks.add(Task.of("T2",3));
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public List<Task> findAll() {
        return tasks;
    }
}
