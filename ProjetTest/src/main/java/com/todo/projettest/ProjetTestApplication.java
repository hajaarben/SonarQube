package com.todo.projettest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjetTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetTestApplication.class, args);
        TaskManager taskManager = new TaskManager();

        // ERREUR : Appel à une méthode inexistante
        taskManager.nonExistentMethod();

        // ERREUR : Argument manquant dans l'appel de méthode
        taskManager.addTask();

        // ERREUR : Type incompatible
        String result = taskManager.viewTasks();
    }
}