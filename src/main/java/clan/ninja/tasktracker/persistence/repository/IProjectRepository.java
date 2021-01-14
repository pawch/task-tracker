package clan.ninja.tasktracker.persistence.repository;

import clan.ninja.tasktracker.persistence.model.Project;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProjectRepository extends PagingAndSortingRepository<Project, Long> {
}
