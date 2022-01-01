import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Samochod samochod = new Samochod("Peugeot", "508", 2, 80000);
        System.out.println(samochod.toString());

        SUV suv = new SUV("Peugeot", "3008", 2, 95000, 18);
        System.out.println(suv.toString());

        Crossover crossover = new Crossover("Peugeot", "2008", 2, 87500, 17, 5);
        System.out.println(crossover.toString());

        List<Samochod> listaSamochodow = new ArrayList<>();
        listaSamochodow.add(samochod);
        listaSamochodow.add(suv);
        listaSamochodow.add(crossover);
        System.out.println(listaSamochodow);

    }
}
