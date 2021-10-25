import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student a = new Student();
        a.imie = "Adam";
        a.nazwisko = "Pilny";
        a.numerIndeksu = 296634;
        a.czyStypendium = false;

        Student b = new Student();
        b.imie = "Bartosz";
        b.nazwisko = "Niezdara";
        b.numerIndeksu = 230636;
        b.czyStypendium = true;

        Student c = new Student();
        c.imie = "Cezary";
        c.nazwisko = "Łobuz";
        c.numerIndeksu = 319958;
        c.czyStypendium = false;

        String[] tab1 = new String[]{a.imie, b.imie, c.imie};
        String[] tab2 = new String[]{a.nazwisko, b.nazwisko, c.nazwisko};
        int[] tab3 = new int[]{a.numerIndeksu, b.numerIndeksu , c.numerIndeksu};
        boolean[] tab4 = new boolean[]{a.czyStypendium, b.czyStypendium, c.czyStypendium};

        for (int i = 0; i < tab1.length; i++)
        {
            System.out.print(tab1[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < tab2.length; i++)
        {
            System.out.print(tab2[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < tab3.length; i++)
        {
            System.out.print(tab3[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < tab4.length; i++)
        {
            System.out.print(tab4[i] + " ");
        }

    }
}
