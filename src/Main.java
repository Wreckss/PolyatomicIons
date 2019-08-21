import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String acetateFormula = "C2H3O2^-1";
    private static final String carbonateFormula = "CO3^-2";
    private static final String hyCarbFormula = "HCO3^-1";
    private static final String hydroxide = "OH^-1";
    private static final String nitrite = "NO2^-1";
    private static final String nitrate = "NO3^-1";

    private static Map<String, String> ions = new HashMap<>();

    private  static String[] names = new String[]{
            "acetate",
            "carbonate",
            "hydrogen carbonate",
            "hydroxide",
            "nitrite",
            "nitrate"
    };
    private static String[] formulas = new String[]{
            acetateFormula,
            carbonateFormula,
            hyCarbFormula,
            hydroxide,
            nitrite,
            nitrate
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
            ions.put(names[i], formulas[i]);
        }
    }
}
