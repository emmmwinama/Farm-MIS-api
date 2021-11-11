package tech.emmmwinama.groproapi.controllers;

@RepositoryRestController
@RequestMapping("/tasks")
public class TaskKickOffController {
    @PostMapping("/start/{id}")
    public ResponseEntity start(@PathVariable Long id) {
        
        return null;
    }
}