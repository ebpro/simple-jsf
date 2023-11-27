package fr.univtln.bruno.sample.jsf.repository;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ApplicationScoped
public class DB {
    public static final List<Task> TASKS = Collections.synchronizedList(new ArrayList<>());

    static {
        TASKS.add(Task.of("T1",1));
        TASKS.add(Task.of("T2",3));
    }
}
