package fr.Tashiga.portfolio.repository;

import fr.Tashiga.portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
