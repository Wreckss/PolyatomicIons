import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static String acetate = "C2H3O2^-1";

    private static Map<String, String> ions = new HashMap<>();
    private  static String[] names = new String[]{
            "acetate",
            "carbonate",
            "hydrogen carbonate",
            "hydroxide",
            "nitrite",
            "nitrate"
    };
    private static String[] bonds = new String[]{
            acetate,
            "CO<sub>3</sub><sup>-2</sup>",
            "HCO<sub>3</sub><sup>-1</sup>",
            "OH<sup>-1</sup>",
            "NO<sub>2</sub><sup>-1</sup>",
            "NO<sub>3</sub><sup>-1</sup>"
    };

    public static void main(String[] args) {
        fillMap();
        System.out.println(ions);
    }

    private static boolean checkAnswer(String answer) {

        return false;
    }

    private static void fillMap() {
        for (int i = 0; i < names.length; i++) {
            ions.put(names[i], bonds[i]);
        }
    }
}
