import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una semilla: ");
        int seed = Integer.parseInt(sc.nextLine());

        Random rnd = new java.util.Random(seed);
        System.out.println("Los siguientes 5 números generados por esta semilla son: ");
        for (int i = 0; i < 5; i++){
            System.out.println(rnd.nextInt());
        }
        
        System.out.printf("Introduce otra semilla: ");
        seed = Integer.parseInt(sc.nextLine());
        rnd = new java.util.Random(seed);
        System.out.println("Los siguientes 5 números generados por esta semilla son: ");
        for (int i = 0; i < 5; i++){
            System.out.println(rnd.nextInt());
        }

    }
}