package tech.emmmwinama.groproapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tech.emmmwinama.groproapi.models.Task;
import tech.emmmwinama.groproapi.repositories.TaskRepository;

import java.util.Optional;

@RepositoryRestController
public class TaskKickOffController {
    @Autowired
    TaskRepository taskRepository;

    @PostMapping("/tasks/start/{id}")
    public ResponseEntity start(@PathVariable Long id){
        Optional<Task> taskResponse = taskRepository.findById(id);

        Task task = taskResponse.get();

        if(task == null){
            throw new ResourceNotFoundException();
        }
        task.setStatus("IN PROGRESS");
        taskRepository.save(task);

        return ResponseEntity.ok(task.getId() + " has started");
    }
}
