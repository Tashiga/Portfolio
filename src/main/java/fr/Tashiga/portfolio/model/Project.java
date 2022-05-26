package fr.Tashiga.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title = "";
    private String description = "";
    private String startDate = "";
    private String endDate = "";

    public Project() {}

    public Project(String title, String description, String startDate, String endDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Project(String title, String description, String startDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
    }

    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void finish() {
        if (this.endDate == null || this.endDate.isEmpty()) {
            this.endDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")).toString();
            System.out.println(this.endDate);
        }

    }

    public void start() {
        if (this.startDate == null || this.startDate.isEmpty()) {
            this.startDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd")).toString();
            System.out.println(this.startDate);
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
