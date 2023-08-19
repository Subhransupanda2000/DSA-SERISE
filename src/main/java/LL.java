import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();
        List.add("hillo");

        List.addFirst("i");
        List.add(1, "subhransu");
        List.add(2, "am");
        List.addLast("panda");
        List.remove(3);
        List.removeFirst();
        List.removeLast();
        System.out.println(List);

        System.out.println(List.get(0));
        System.out.println(List.size());


    }
}
