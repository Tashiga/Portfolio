package fr.Tashiga.portfolio.controler;

import fr.Tashiga.portfolio.model.Administrator;
import fr.Tashiga.portfolio.service.AdministratorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorControler {
    private AdministratorService administratorService;

    public AdministratorControler (AdministratorService administratorService) {
        this.administratorService = administratorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Administrator>> getAllAdministrators () {
        List<Administrator> administrators = administratorService.findAllAdmin();
        return new ResponseEntity<>(administrators, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Administrator> getAdministratorByid (@PathVariable ("id") Long id) {
        Administrator administrator = administratorService.findAdminById(id);
        return new ResponseEntity<>(administrator, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Administrator> addAdministrator (@RequestBody Administrator administrator) {
        Administrator newAdministrator = administratorService.addAdmin(administrator);
        return new ResponseEntity<>(newAdministrator, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Administrator> updateAdministrator (@RequestBody Administrator administrator) {
        Administrator updatedAdministrator = administratorService.updateAdmin(administrator);
        return new ResponseEntity<>(updatedAdministrator, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAdministrator (@PathVariable ("id") Long id) {
        administratorService.deleteAdmin(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
