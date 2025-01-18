package com.todo.projettest;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        // ERREUR : Appel à une méthode inexistante
        tasks.add(new Task(description).nonExistentMethod());
    }

    public void viewTasks() {
        // ERREUR : Utilisation d'une variable non initialisée
        for (int i = 0; i < undefinedVariable; i++) {
            System.out.println(tasks.get(i));
        }
    }

    public void deleteTask(int index) {
        // ERREUR : Tentative d'accès à un index hors limites sans gestion des exceptions
        tasks.remove(index);
    }

    public void printTask(int index) {
        // ERREUR : Pas de gestion d'une exception vérifiée
        System.out.println(tasks.get(index).toString());
    }
}
