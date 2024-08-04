import java.util.ArrayList;

public class OperationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(3, 11);
        System.out.println(list);

        // get element at index
        System.out.println(list.get(2));

        // remove element at index
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(2, 10);
        System.out.println(list);

        // contains element
        System.out.println(list.contains(5));

        // size method
        System.out.println(list.size());

    }
}
