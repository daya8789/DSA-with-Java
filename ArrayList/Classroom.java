import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // System.out.println(list);

        // Get Operations -- O(1)
        // int Element = list.get(2);
        // System.out.println(Element);

        // Delete Operations -- O(n)
        list.remove(2);
        // System.out.println(list);

        // Set Operations -- O(n)
        list.set(2, 10);
        list.set(3, 20);
        //System.out.println(list);

        // Contains Operation -- O(n) it show the element is present or absent in the
        // array
        // System.out.println(list.contains(10));
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(2));

        list.add(2, 34);
        list.add(4, 25);
       // System.out.println(list);

       
       //   Size of ArrayList
       System.out.println(list.size());
       for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
       }
       System.out.println();
    }
}
