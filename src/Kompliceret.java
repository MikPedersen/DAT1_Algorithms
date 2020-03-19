public class Kompliceret {

    public static void main(String[] args) {

        MyTimer.start();

        int n = 100000;

        long resultat = 0;

        // Denne algoritme tager meget lang tid at gennemføre, og har en algoritmisk kompleksitet på O(N^2)
//        for (int i = 0; i < n; i++) {
//            if (i%10000==0) System.out.print(".");
//            for (int j = 0; j < i; j++) {
//                for (int k = 0; k < j; k++) {
//                     resultat = i*j*k;
//                }
//
//            }
//
//        }
//        System.out.println("Resultat " + resultat);
        Algoritmer.bubbleSort(Algoritmer.data);
        MyTimer.stop();

    }
}
