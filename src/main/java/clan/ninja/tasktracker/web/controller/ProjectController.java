package clan.ninja.tasktracker.web.controller;

import clan.ninja.tasktracker.persistence.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @GetMapping(path = "/1")
    public Project findOne() {
        return new Project("testName", LocalDate.now());
    }
}
