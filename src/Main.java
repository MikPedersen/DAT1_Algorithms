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
    static long startTime = MyTimer.currentTimestamp();
    static long endTime = MyTimer.currentTimestamp();
    static Date date=new Date(startTime);
    static String resultat = MyTimer.timeElapsed(startTime, endTime) ;
    private static final int N = 70000; // Change the value of N for more or less iterations

    public static void main(String[] args) {

        myBubbleSort();
        myFindMax();
        //Slet alle tal i listen så vi kan sortere dem igen med metode 2
        Algoritmer.data.removeAll(Algoritmer.data);

        mySelectionSort();
        myFindMax();


    }


    /**
     * This is the algorithm, we are testing in the main method
     */
    private static void myAlgorithm() {

        for (int i = 0; i <N ; i++) {
            System.out.print(".");
        }

    }
    private static void mySelectionSort(){
        // Indsæt tal i data til brug for sortering
        for (int i = 0; i < N; i++) {
            Algoritmer.data.add((int) (Math.random() * 250001));
        }
        Algoritmer.selectionSort();
        System.out.println();
        System.out.println(resultat);

    }
    private static void myBubbleSort(){
        for (int i = 0; i < N; i++) {
            Algoritmer.data.add((int) (Math.random() * 250001));
        }
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");
        Algoritmer.bubbleSort(Algoritmer.data);
        System.out.println();
        System.out.println(resultat);
    }
    private static void myFindMax(){
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");
        Algoritmer.findmax();
        System.out.println(resultat);
    }
}
