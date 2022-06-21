package fundamentials;

/*
* In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
* Your function receives one side of the DNA (string, except for Haskell);
* you need to return the other complementary side.
* DNA strand is never empty or there is no DNA at all (again, except for Haskell).

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"

* */

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
