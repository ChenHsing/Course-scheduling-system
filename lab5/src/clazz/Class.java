package clazz;
import clazz.Sequence;
public class Class {
    public String[] observed = new String[20];
    private int grade;
    private String name;
    private int sum;
    private Sequence sq;

    public Class() {

    }

    public Class(int grade, String name, int sum) {
        this.grade = grade;
        this.name = name;
        this.sum = sum;
        setSq(new Sequence());
    }

    public Sequence getSq() {
        return sq;
    }

    public void setSq(Sequence sq) {
        this.sq = sq;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
