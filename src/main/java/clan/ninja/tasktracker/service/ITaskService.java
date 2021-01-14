package clan.ninja.tasktracker.service;

import clan.ninja.tasktracker.persistence.model.Task;

import java.util.Optional;

public interface ITaskService {
    Optional<Task> findById(Long id);

    Task save(Task project);
}
