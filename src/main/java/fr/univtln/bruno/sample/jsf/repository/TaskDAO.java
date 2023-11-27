package fr.univtln.bruno.sample.jsf.repository;

import java.util.List;


public class TaskDAO {

    public void add(Task task) {
        DB.TASKS.add(task);
    }

    public List<Task> findAll() {
        return DB.TASKS;
    }
}
