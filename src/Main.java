import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Método principal donde se corren las funciones
         */
        System.out.print("Ingrese la cadena de ADN a traducir: ");
        Scanner consola = new Scanner(System.in);
        System.out.println();
        String cadenaARN = consola.nextLine();
        System.out.println(traduccionARN(cadenaARN));
        printArray(codigoGenetico(traduccionARN(cadenaARN)));
    }

    public static String[] codigoGenetico(String cod) {
        /*
        Función que transforma una cadena de texto usando un HashMap
        a Proteinas, recibe como argumento la función de tracucciónARN
         */
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

    public static String traduccionARN(String cod) {
        /*
        Función que permite traducir una secuencia de ADN a una de ARN
         */
        char[] codArray = cod.toCharArray();
        StringBuilder newChain = new StringBuilder();
        for (int i = 0; i < cod.length(); i++) {
            switch (codArray[i]) {
                case 'T':
                    newChain.append('A');
                    break;
                case 'A':
                    newChain.append('U');
                    break;
                case 'C':
                    newChain.append('G');
                    break;
                case 'G':
                    newChain.append('C');
                    break;
            }
        }
        return newChain.toString();
    }

    public static void printArray(String[] arr) {
        /*
        Función para imprimir las proteinas obtenidas del ARN
         */
        System.out.println("Proteinas obtenidas: ");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static HashMap<String, String> introduceGen() {
        /*
        Función donde alimento el hashmap con información
         */
        Map<String, String> m = new HashMap<>();
        m.put("UUU", "Phe");m.put("UUC", "Phe");m.put("UUA", "Leu");
        m.put("UUG", "Leu");m.put("UCU", "Ser");m.put("UCC", "Ser");
        m.put("UCA", "Ser");m.put("UCG", "Ser");m.put("UAU", "Tyr");
        m.put("UAC", "Tyr");m.put("UAA", "STOP");m.put("UAG", "STOP");
        m.put("UGA", "STOP");m.put("UGU", "Cys");m.put("UGC", "Cys");
        m.put("UGG", "Trp");m.put("CUU", "Leu");m.put("CUC", "Leu");
        m.put("CUA", "Leu");m.put("CUG", "Leu");m.put("CCU", "Pro");
        m.put("CCC", "Pro");m.put("CCA", "Pro");m.put("CCG", "Pro");
        m.put("CAU", "His");m.put("CAC", "His");m.put("CAA", "Gln");
        m.put("CAG", "Gln");m.put("CGU", "Arg");m.put("CGC", "Arg");
        m.put("CGA", "Arg");m.put("CGG", "Arg");

        return (HashMap) m;
    }

}
