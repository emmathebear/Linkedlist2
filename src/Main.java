import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> linkedList = new LinkedList<>();
        linkedList.add(new Fruit("Albicocca"));
        linkedList.add(new Fruit("Ciliegia"));
        linkedList.add(new Fruit("Pera"));
        linkedList.add(new Fruit("Pesca"));
        System.out.println(linkedList);
        linkedList.addLast(new Fruit("Banana"));
        linkedList.addFirst(new Fruit("Limone"));
        System.out.println(linkedList);
    }
}