package lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My name Kamil.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println((118/2)*4);

        int lines = 6;
        for (int line = 1; line < lines; line ++) {
           print_line(lines - line, (line * 2) - 1);
        }
        System.out.println("   ***");
        System.out.println("   ***");
    }
    public static void print_line(int space, int star) {
        for(int i = 1; i < space; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i< star; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}