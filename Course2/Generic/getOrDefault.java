import java.util.HashMap;

public class getOrDefault {
    public static void main(String[] args) {
        String [] abc = {"A", "B", "C", "C", "D", "A", "A"};
        HashMap<String, Integer> hm = new HashMap<>();

        for(String key : abc) {
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
        System.out.println(hm);

    }
}
