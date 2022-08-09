import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        SortedSet<String> al = new TreeSet<String>();
        al.add("TSAI");
        al.add("KUMAR");
        al.add("REDDY");
        al.add("COLLEGE");
        al.add("INTER");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {


            System.out.println(itr.next());
        }
    }
}











