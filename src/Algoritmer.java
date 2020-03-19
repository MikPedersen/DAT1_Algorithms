import java.util.ArrayList;

public class Algoritmer {
    static ArrayList<Integer> data = new ArrayList<>();
    public static void main(String[] args) {
//      Hvis man ville bruge array ville det se sådan ud
//        int data[]= {(int) Math.random(),(int) Math.random(),(int) Math.random(),(int) Math.random(),(int) Math.random(),(int) Math.random(),
//                (int) Math.random(),(int) Math.random(),(int) Math.random(),(int) Math.random()};

        //tilføjer 10 tilfældige tal mellem 0 og 20
        for (int i = 0; i < 1000000000; i++) {
            data.add((int) (Math.random() * 25000001));
        }
        //sorterer tallene
        //Collections.sort(data);

        //udskriver listen
        System.out.println(data);

        //kalder de 3 metoder
        find(5);
        findalle(5);
        findmax();

        //Vælg en metode til sortering
        //bubbleSort(data);
        selectionSort();

        //udskriv listen til tjek
        System.out.println(data);
    }

    public static void find(int x) {

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == x) {
                System.out.println("Tallet er placeret på index " + i);

            } else
                System.out.println("Tallet findes ikke i listen");
        }
    }
    public static void findalle (int x){
        int sum= 0;
        for (int i = 0; i <data.size() ; i++) {
            if (data.get(i)== x){
                sum++;
            }
        }
        System.out.println("Tallet indgår " + sum + " antal gange på listen");
    }
    public static void findmax(){
        int max = 0;
        for (int i = 0; i < data.size(); i++) {
            if (max < data.get(i)){
                max = data.get(i);
            }

        }
        System.out.println("Det største tal er " + max);
    }

    public static void bubbleSort(ArrayList<Integer> data) {
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 1; j < data.size() - i; j++) {
                if (data.get(j-1) > data.get(j)) {
                    swap(data, j, j - 1);
                }
            }
        }
    }

    private static void swap(ArrayList<Integer> data, int a, int b) {
        Integer temp = data.get(a);
        data.set(a, data.get(b));
        data.set(b, temp);
    }

    public static void selectionSort(){
        for (int i = 0; i < data.size(); i++) {
            int currentminimum = data.get(i);
            int currentminimumIndex = i;

            for (int j = i+1; j < data.size(); j++) {
                if (currentminimum > data.get(j)){
                    currentminimum = data.get(j);
                    currentminimumIndex = j;
                }
            }
            if (currentminimumIndex!= i){
                data.set(currentminimumIndex, data.get(i));
                data.set(i, currentminimum);
            }
        }

    }
}
