package classwork;
import java.util.HashMap;
import java.util.Map;

public class MapStudy {
    public static void main(String[] args) {
        String str = "bwaerbctyxbacecrtdcvr";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
        }

        System.out.println(result.toString());
    }
}