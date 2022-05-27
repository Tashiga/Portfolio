package fr.Tashiga.portfolio.service;

import fr.Tashiga.portfolio.exception.UserNotFoundException;
import fr.Tashiga.portfolio.model.Project;
import fr.Tashiga.portfolio.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    private ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> findAllProject() {
        return projectRepo.findAll();
    }

    public Project findProjectById(Long id) {
        return projectRepo.findProjectById(id)
                .orElseThrow(() -> new UserNotFoundException("user with id " + id + "was not found"));
    }

    public void deleteProject(Long id) {
        projectRepo.deleteProjectById(id);
    }

//    add a comment for a commit
//    an other comment
}
