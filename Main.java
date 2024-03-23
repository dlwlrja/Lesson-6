import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        >
        <
        ==
        >=
        <=
        !=
        */
        System.out.println("First: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Second: ");
        int b = new Scanner(System.in).nextInt();
        /*if(a>5){
            System.out.println("Hello world");
        }
        if (a<5){
            System.out.println("Goodbye world");
        } */
        if(a>5 && b<5){
            System.out.println("hello world");
        }
        if(a<5 && b>5){
            System.out.println("goodbye world");
        }
            // логическая И &&
            // логическая ИЛИ ||
    }
}
