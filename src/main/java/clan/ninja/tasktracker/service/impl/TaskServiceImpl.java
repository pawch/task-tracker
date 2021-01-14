package clan.ninja.tasktracker.service.impl;

import clan.ninja.tasktracker.persistence.model.Task;
import clan.ninja.tasktracker.persistence.repository.ITaskRepository;
import clan.ninja.tasktracker.service.ITaskService;

import java.util.Optional;

public class TaskServiceImpl implements ITaskService {
    private ITaskRepository taskRepository;

    public TaskServiceImpl(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task save(Task project) {
        return taskRepository.save(project);
    }
}
