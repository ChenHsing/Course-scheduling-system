package clazz;

import java.util.LinkedList;

public class Sequence {
    private LinkedList<String> list = new LinkedList<>();

    public Sequence() {
        list.add("a-星期一 1-2 节");
        list.add("b-星期一 3-4 节");
        list.add("c-星期一 5-6 节");
        list.add("d-星期一 7-8 节");
        list.add("e-星期二 1-2 节");
        list.add("f-星期二 3-4 节");
        list.add("g-星期二 5-6 节");
        list.add("h-星期二 7-8 节");
        list.add("i-星期三 1-2 节");
        list.add("j-星期三 3-4 节");
        list.add("k-星期三 5-6 节");
        list.add("l-星期三 7-8 节");
        list.add("m-星期四 1-2 节");
        list.add("n-星期四 3-4 节");
        list.add("o-星期四 5-6 节");
        list.add("p-星期四 7-8 节");
        list.add("q-星期五 1-2 节");
        list.add("r-星期五 3-4 节");
        list.add("s-星期五 5-6 节");
        list.add("t-星期五 7-8 节");
    }

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }
}
