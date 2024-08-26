package swaggerdb2app.repositories.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name = "SERIES", schema = "FN24_4MI0700174")
public class Movie {

    @Id
    @Column(name = "TITLE_S")
    private String title;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "RATING")
    private double rating;

    // Constructors
    public Movie() {
        // Default constructor
    }

    public Movie(String title, Integer year, String description, double rating) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.rating = rating;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}