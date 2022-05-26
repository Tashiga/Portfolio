package fr.Tashiga.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Administrator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String lastName = "";
    private String firstName = "";
    private String email = ""; // has to code functions
    private String description = "";
    private Gender gender = Gender.M;
    @Column(nullable = false, updatable = false)
    private String password = "";
    private String phone = ""; // has to code functions
    private String imageURL = "";

    public Administrator() {}

    public Administrator(
            String lastName,
            String firstName,
            String email,
            String description,
            String password,
            String phone,
            String imageURL,
            ArrayList<Project> projects,
            Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.description = description;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.password = password;
        this.imageURL = imageURL;
    }

    public Administrator(
            String email,
            String password) {
        this.email = email;
        this.password = password;
    }

    public Administrator(
            String lastName,
            String firstName,
            String email,
            String password,
            String imageURL,
            Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.imageURL = imageURL;
    }

    public Administrator(
            String lastName,
            String firstName,
            String email,
            String password,
            String phone,
            String imageURL,
            Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.password = password;
        this.imageURL = imageURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void addPassword(String password) {
        if (!isPassword())
            this.password = password;
    }

    public void changePassword(String oldPass, String newPass) {
        if (isPassword()) {
            if (this.password.equals(oldPass))
                this.password = newPass;
        }
    }

    /*
     * check if the admin has a password
     */
    public boolean isPassword() {
        if (this.password.isEmpty() || this.password == "" || this.password == null)
            return false;
        return true;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Administrateur{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
