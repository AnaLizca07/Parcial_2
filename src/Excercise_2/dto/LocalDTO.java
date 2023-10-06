package Excercise_2.dto;

import java.io.Serializable;

public class LocalDTO implements Serializable {
    public Integer id;
    private String category;
    private String schedule;
    private String name;

    public LocalDTO(Integer id, String category, String schedule, String name) {
        this.id = id;
        this.category = category;
        this.schedule = schedule;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Local:"+
                "\nid=" + id +
                "\ncategory=" + category +
                "\nschedule=" + schedule +
                "\nname=" + name;
    }
}
