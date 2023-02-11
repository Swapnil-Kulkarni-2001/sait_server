package org.sait.server.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Event
{
    public String name;
    public String description;
    public String poster;
    public String objective;
    public String outcome;
    public List<HashMap<String,String>> memories;

    public Event() {
    }

    public Event(String name, String description, String poster, String objective, String outcome, List<HashMap<String,String>> memories) {
        this.name = name;
        this.description = description;
        this.poster = poster;
        this.objective = objective;
        this.outcome = outcome;
        this.memories = memories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public List<HashMap<String,String>> getMemories() {
        return memories;
    }

    public void setMemories(List<HashMap<String,String>> memories) {
        this.memories = memories;
    }
}
