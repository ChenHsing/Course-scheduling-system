package clazz;

public class ClassRoom {
    private int id;
    private String name;
    private int capacity;
    private Sequence sq;

    public ClassRoom(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        setSq(new Sequence());
    }

    public ClassRoom() {

    }

    public Sequence getSq() {
        return sq;
    }

    public void setSq(Sequence sq) {
        this.sq = sq;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
