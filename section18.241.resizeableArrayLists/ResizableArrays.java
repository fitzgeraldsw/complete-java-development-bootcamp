import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {

        // ArrayList can only store objects
        ArrayList<String> names = new ArrayList<String>();
        names.add("Scott");
        names.add("Luke");
        names.add("Henry");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        names.set(1, "L-Fresh");
        // System.out.println(names.get(1));
        names.add(3, "Evelyn");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}