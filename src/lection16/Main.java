package lection16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        person person1 = new person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String userName = scanner.next();
        System.out.println("Имя " + userName);
        System.out.println("ВВЕДИТЕ ВАШ ВОЗВРАСТ: ");
        int userAge = scanner.nextInt();
        System.out.println(userAge);


        person1.setNameAge(userName, userAge);
        person1.getName();

    }

    static class person {
        private String name;
        private int age;
        public void setNameAge(String userName, int userAge) {
            if (!userName.isEmpty()) {
                name = userName;
           } else
               System.out.println("Не ввели имя");
            if (userAge > 0 && userAge < 100) {
                age = userAge;
            } else
               System.out.println("Не правильный возвраст");
        }
        public void getName() {
            System.out.println(name + " - " + age);

        }
    }

}
