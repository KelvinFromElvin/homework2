import java.util.Hashtable;
import java.util.Map;

public class Colors {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String RESET = "\u001B[0m";

    public static Map<String, String> createColorsDict() {
        Map<String, String> colorsDict = new Hashtable<>();
        colorsDict.put("_§black", BLACK);
        colorsDict.put("_§red", RED);
        colorsDict.put("_§green", GREEN);
        colorsDict.put("_§yellow", YELLOW);
        colorsDict.put("_§blue", BLUE);
        colorsDict.put("_§purple", PURPLE);
        colorsDict.put("_§cyan", CYAN);
        colorsDict.put("_§white", WHITE);

        colorsDict.put("_§", RESET);

        return colorsDict;
    }
}
