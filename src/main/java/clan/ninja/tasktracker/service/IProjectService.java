package clan.ninja.tasktracker.service;

import clan.ninja.tasktracker.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);
    Project save(Project project);
}
