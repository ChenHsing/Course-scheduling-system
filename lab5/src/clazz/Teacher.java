package clazz;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    public String[] observed = new String[20];
    public Set<String> teachCourse = new HashSet<>();
    private int id;
    private String name;
    private Sequence sq;

    public Teacher() {
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        setSq(new Sequence());
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

    public Sequence getSq() {
        return sq;
    }

    public void setSq(Sequence sq) {
        this.sq = sq;
    }
}
