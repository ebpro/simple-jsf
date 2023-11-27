package fr.univtln.bruno.sample.jsf.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor(staticName = "of")
@ToString
public class Task {
    private String title;
    private int importance;
}
