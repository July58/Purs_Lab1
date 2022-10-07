import java.util.*;


public class Task1 {
    public static void main(String[] args) {

        System.out.println(singleton("Bike"));

        LinkedList<Object> list = new LinkedList<>(Arrays.asList("a", "b", "c"));
        System.out.println(isnull(list));

        System.out.println(snoc(list, "d"));

        System.out.println(length(list));

    }

    public static LinkedList<Object> singleton(Object input) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(input);
        return list;
    }

    public static boolean isnull(LinkedList<Object> list) {
        boolean anyElement;
        anyElement = list.size() == 0;
        return anyElement;
    }

    public static List<Object> snoc(List<Object> list, Object word) {
        list.add(word);
        return list;
    }

    public static int length(LinkedList<Object> list) {
        int len = 0;
        for (Object i : list) {
            len++;
        }
        return len;
    }


}
