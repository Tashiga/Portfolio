package fr.Tashiga.portfolio.service;

import fr.Tashiga.portfolio.model.Project;
import fr.Tashiga.portfolio.repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectService {
    private ProjectRepo projectRepo;

    @Autowired
    public projectService (ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }



}
