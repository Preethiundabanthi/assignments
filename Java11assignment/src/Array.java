import java.util.Arrays;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList();
        list.add("A");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        list.add("jumps");
        list.add("over");
        list.add("the");
        list.add("lady");
        list.add("dog");
        System.out.println(list);
        String[]arg=list.toArray(String[]::new);
        System.out.println(Arrays.toString(arg));
    }

}
