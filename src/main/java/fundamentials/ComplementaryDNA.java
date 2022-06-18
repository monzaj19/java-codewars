package fundamentials;

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("GTAT"));
    }

    public static String makeComplement(String dna) {
        String correct = "";

        for (int i = 0; i < dna.length(); i++){
            char c = dna.charAt(i);

            switch (c){
                case 'A':
                    correct += "T";
                    break;
                case 'T':
                    correct += "A";
                    break;
                case 'C':
                    correct += "G";
                    break;
                case 'G':
                    correct += "C";
                    break;
            }
        }

        return correct;
    }
}
