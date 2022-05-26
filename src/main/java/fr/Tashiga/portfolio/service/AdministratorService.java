package fr.Tashiga.portfolio.service;

import fr.Tashiga.portfolio.exception.UserNotFoundException;
import fr.Tashiga.portfolio.model.Administrator;
import fr.Tashiga.portfolio.repository.AdministratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService {
    private AdministratorRepo administratorRepo;

    @Autowired
    public AdministratorService(AdministratorRepo administratorRepo) {
        this.administratorRepo = administratorRepo;
    }

    public Administrator addAdmin(Administrator administrator) {
        return administratorRepo.save(administrator);
    }

    public List<Administrator> findAllAdmin() {
        return administratorRepo.findAll();
    }

    public Administrator findAdminById(Long id) {
        return administratorRepo.findAdminById(id)
                .orElseThrow(() -> new UserNotFoundException ("user with id " + id + "was not found"));
    }

    public void deleteAdmin(Long id) {
        administratorRepo.deleteAdminById(id);
    }

}
