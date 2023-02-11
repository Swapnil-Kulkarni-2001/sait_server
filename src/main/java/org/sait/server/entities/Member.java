package org.sait.server.entities;

public class Member {

    private String name;
    private String position;
    private String profile_url;
    private String message;
    private String linkedin_url;
    private String github_url;
    private String email;



    public Member() {
    }



    public Member(String name, String position, String profile_url, String message, String linkedin_url,
                  String github_url, String email) {
        this.name = name;
        this.position = position;
        this.profile_url = profile_url;
        this.message = message;
        this.linkedin_url = linkedin_url;
        this.github_url = github_url;
        this.email = email;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getPosition() {
        return position;
    }



    public void setPosition(String position) {
        this.position = position;
    }



    public String getProfile_url() {
        return profile_url;
    }



    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }



    public String getMessage() {
        return message;
    }



    public void setMessage(String message) {
        this.message = message;
    }



    public String getLinkedin_url() {
        return linkedin_url;
    }



    public void setLinkedin_url(String linkedin_url) {
        this.linkedin_url = linkedin_url;
    }



    public String getGithub_url() {
        return github_url;
    }



    public void setGithub_url(String github_url) {
        this.github_url = github_url;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }
}
