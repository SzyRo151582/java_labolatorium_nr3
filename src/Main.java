import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(1, 2, 3);
        System.out.println(punktB.toString());

        punktA.setpX(12);
        punktA.setpY(3);
        punktA.setpZ(6);
        System.out.println(punktA.toString());

        punktA.getpX();
        punktA.getpY();
        punktA.getpZ();
        System.out.println("pX = " + punktA.getpX() + " ,pY = " + punktA.getpY() + " ,pZ = " + punktA.getpZ());

        punktB.getpX();
        punktB.getpY();
        punktB.getpZ();
        System.out.println("pX = " + punktB.getpX() + " ,pY = " + punktB.getpY() + " ,pZ = " + punktB.getpZ());

        punktA.suma();
        System.out.println(punktA.suma());
        punktB.suma();
        System.out.println(punktB.suma());

        punktA.roznica();
        System.out.println(punktA.roznica());
        punktA.roznica(7, 0, 0);
        System.out.println(punktA.roznica(7, 0, 0));
        punktB.roznica();
        System.out.println(punktB.roznica());
        punktB.roznica(1, 2, 3);
        System.out.println(punktB.roznica(1, 2, 3));

    }
}
