package my.java.study.logicOperations;

import java.util.Scanner;

public class Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "password123";

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите логин: ");

        String usersLogin = sc.next();
        {
            if (login.equals(usersLogin)) {
                System.out.println("Введите пароль: ");
                String usersPassword = sc.next();

                if (password.equals(usersPassword)) {
                    System.out.println("Вы вошли в систему");
                } else System.out.println("Вы ввели неверный пароль");
            } else System.out.println("Нет такого пользователя");
        }
    }
}
