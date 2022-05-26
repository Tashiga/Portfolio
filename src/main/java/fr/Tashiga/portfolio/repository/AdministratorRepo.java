package fr.Tashiga.portfolio.repository;

import fr.Tashiga.portfolio.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministratorRepo extends JpaRepository<Administrator, Long> {

    void deleteAdminById(Long id);
    Optional<Administrator> findAdminById(Long id);
}
