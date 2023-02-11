package org.sait.server.entities;


import java.util.List;

public class ClubService
{
    public String title;
    public String description;
    public List<String> date;
    public List<String> name;
    public String poster;
    public String resource_url;


    public ClubService() {
    }

    public ClubService(String title, String description, List<String> date, List<String> name, String poster, String resource_url) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.name = name;
        this.poster = poster;
        this.resource_url = resource_url;
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

    public List<String> getDate() {
        return date;
    }

    public void setDate(List<String> date) {
        this.date = date;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public String getResource_url() {
        return resource_url;
    }

    public void setResource_url(String resource_url) {
        this.resource_url = resource_url;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
