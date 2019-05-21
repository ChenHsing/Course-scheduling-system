package clazz;

import java.util.HashSet;
import java.util.Set;

public class Course {
    public Set<String> precourse = new HashSet<>();
    private int id;
    private String name;
    private int timesWeek;

    public Course() {
    }

    public Course(int id, String name, int timesWeek) {
        this.id = id;
        this.name = name;
        this.timesWeek = timesWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimesWeek() {
        return timesWeek;
    }

    public void setTimesWeek(int timesWeek) {
        this.timesWeek = timesWeek;
    }
}

