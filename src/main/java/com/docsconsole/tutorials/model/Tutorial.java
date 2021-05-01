package com.docsconsole.tutorials.model;

public class Tutorial {

    private Integer id;
    private String name;
    private String author;
    private Float duration;
    private String type;
    private Float rating;

    public Tutorial(Integer id, String name, String author, Float duration, String type, Float rating) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.duration = duration;
        this.type = type;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Tutorial {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", rating=" + rating +
                '}';
    }
}
