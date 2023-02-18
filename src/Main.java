import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*     int[] array = {11, 21, 31, 41, 51, 61, 71, 81, 91};
        int sum = 0;
        int countre = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(array[i] + " ");
            countre++;
        }
        System.out.println("\n" + sum + "\n" + (double) sum / countre + "\n" + (int) Math.pow(sum, 4));
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        int countre=0;
        for (int a:array) {
            sum +=a;
            System.out.print(a+" ");
            countre++;
        }
        System.out.println("\n"+sum+"\n"+(double)sum/countre+"\n"+(int)Math.pow(sum,3));*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a fruit ");
        System.out.println("1-Banana");
        System.out.println("2-apple");
        System.out.println("3-Tomato");
        System.out.println("4-Kivi");
        System.out.println("5-Sugar");
        System.out.println();
        int frukt = scanner.nextInt();
        int[] array = {3, 2, 5, 8, 9};
        switch (frukt) {
            case 1:
                System.out.println("1kl-Banana.3USD");
                System.out.println("How many kilograms?");
                frukt = scanner.nextInt();
                System.out.println("Price:" + banana(frukt, array));
                break;
            case 2:
                System.out.println("1kilo-Strobery.2USD");
                System.out.println("How many kilograms?");
                frukt = scanner.nextInt();
                System.out.println("Price:" + apple(frukt, array));
                break;
            case 3:
                System.out.println("1kilo-Tomato.5USD");
                System.out.println("How many kilograms?");
                frukt = scanner.nextInt();
                System.out.println("Price:" + tomato(frukt, array));
                break;
            case 4:
                System.out.println("1kilo-Kivi.8USD");
                System.out.println("How many kilograms?");
                frukt = scanner.nextInt();
                System.out.println("Price:" + kivi(frukt, array));
                break;
            case 5:
                System.out.println("1kilo-Sugar.9USD");
                System.out.println("How many kilograms?");
                frukt = scanner.nextInt();
                System.out.println("Price:" + sugar(frukt, array));
                break;
        }
    }

    public static int banana(int kg, int[] banana) {
        return kg * banana[0];
    }

    public static int apple(int kg, int[] apple) {
        return kg * apple[1];
    }

    public static int tomato(int kg, int[] tomato) {
        return kg * tomato[2];
    }

    public static int kivi(int kg, int[] kivi) {
        return kg * kivi[3];
    }

    public static int sugar(int kg, int[] sugar) {
        return kg * sugar[4];
    }
}
