package clan.ninja.tasktracker.persistence.repository;

import clan.ninja.tasktracker.persistence.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}
