import java.util.HashMap;
import java.util.Map;

public class MapTraversing {
    public static void main(String args[]) {

        String str = "ABC";
        byte b[] = str.getBytes();
        for(int i = 0;i<b.length;i++) {
            System.out.println(b[i]);
        }
        // Map<Integer, Integer> map = new HashMap<>();

        // map.put(1, 1);
        // map.put(2, 2);
        // map.put(3, 3);
        // map.put(4, 4);

        // for(Map.Entry<Integer, Integer> elements : map.entrySet()) {
        //     System.out.println("The value of key: " + elements.getKey() + " the value of the value: " + elements.getValue());
        // }
    }
}