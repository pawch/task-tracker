package clan.ninja.tasktracker.service.impl;

import clan.ninja.tasktracker.persistence.model.Project;
import clan.ninja.tasktracker.persistence.repository.IProjectRepository;
import clan.ninja.tasktracker.service.IProjectService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
