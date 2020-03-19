import java.util.Date;

/*
* This is a tiny library for testing how long a given algorithm takes to execute
*
* Usage:
* 1) replace myAlgorithm() with your own algorithm
* 2) change N to test, how long it takes to execute your code
*
* Be aware: You are likely to crash your apps :)
*
* See results of my execution:
* https://docs.google.com/spreadsheets/d/1bNa1zfQ4yqkKcMb42Kh8lSZjfu97V9hx9i1qyvlfAtw/edit#gid=0
*
* Written by András Ács anac@easj.dk in 2017
*
* */
public class Main {

    private static final int N = 700; // Change the value of N for more or less iterations

    public static void main(String[] args) {

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        // Indsæt tal i data til brug for sortering
        for (int i = 0; i < 1000000; i++) {
            Algoritmer.data.add((int) (Math.random() * 250001));
        }
        //myAlgorithm(); // Replace this with your own algorithm
//        Algoritmer.bubbleSort(Algoritmer.data);
        Algoritmer.selectionSort();
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
    }


    /**
     * This is the algorithm, we are testing in the main method
     */
    private static void myAlgorithm() {

        for (int i = 0; i <N ; i++) {
            System.out.print(".");
        }

    }
}
