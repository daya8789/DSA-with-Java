import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        // add Operations 
        List.add(5);
        List.add(10);
        List.add(23);
        System.out.println(List);
        // add in between
        List.add(1, 34);
        System.out.println(List);
        List.add(3, 15);
        System.out.println(List);
        System.out.println("get method is used to get the element from the arraylist");
        int Element = List.get(1);
        System.out.println(Element);
        List.add(1, 56);
        System.out.println(List);
        List.set(3, 100);
        System.out.println(List);
        List.add(4, 89);
        System.out.println(List);
        // Delete the element from the arraylist
        List.remove(4);
        System.out.println(List);
        // find the size of arraylist
        int size = List.size();
        System.out.println(size);
        // loop is arraylist
        for(int i=0; i<List.size(); i++){
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
        // to sort the arraylist elements
        Collections.sort(List);
        System.out.println(List);
    }
}