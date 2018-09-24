package pl.projects.bartek.imiona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jesli chcesz zakonczyc program wpisz - exit");
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();


        while (!name.equals("exit")) {


            if (name.endsWith("a")) {
                System.out.println(name + " - kobieta");
            } else {


                System.out.println(name + " - facet");
            }
            System.out.println("Jesli chcesz zakonczyc program wpisz - exit");
            System.out.println("Podaj imie:");
            name = scanner.nextLine();

        }
    }
}
