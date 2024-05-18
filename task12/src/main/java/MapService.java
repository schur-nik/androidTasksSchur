import java.util.HashMap;
import java.util.Map;

public class MapService {
    public static Map<String, Boolean> uniqStringMap(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();
        for (String string : strings) {
            if (result.containsKey(string)) {
                result.put(string, true);
            } else {
                result.put(string, false);
            }
        }
        return result;
    }
}
