import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String cadenaARN = "UUUUUCUCCUAAUGAUGG";
        printArray(codigoGenetico(cadenaARN));
    }

    public static String[] codigoGenetico(String cod) {
        HashMap<String, String> m;
        m = introduceGen();

        List<String> protList = new ArrayList<>();

        for (int i = 0; i < cod.length(); i += 3) {
            if (i + 3 <= cod.length()) {
                String triplet = cod.substring(i, i + 3);
                String aminoAcid = m.get(triplet);
                if (aminoAcid != null) {
                    if (aminoAcid.equals("STOP")) {
                        break;
                    }
                    protList.add(aminoAcid);
                }
            }
        }
        return protList.toArray(new String[0]);
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static HashMap<String, String> introduceGen() {
        Map<String, String> m = new HashMap<>();
        m.put("UUU", "Phe");
        m.put("UUC", "Phe");
        m.put("UUA", "Leu");
        m.put("UUG", "Leu");
        m.put("UCU", "Ser");
        m.put("UCC", "Ser");
        m.put("UCA", "Ser");
        m.put("UCG", "Ser");
        m.put("UAU", "Tyr");
        m.put("UAC", "Tyr");
        m.put("UAA", "STOP");
        m.put("UAG", "STOP");
        m.put("UGA", "STOP");
        m.put("UGU", "Cys");
        m.put("UGC", "Cys");
        m.put("UGG", "Trp");

        return (HashMap) m;
    }
}
