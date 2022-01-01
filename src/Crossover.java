public class Crossover extends SUV
{
    protected int iloscMiejsc;

    public Crossover()
    {
        super();
        this.iloscMiejsc = 0;
    }

    public Crossover(int iloscMiejsc)
    {
        this.iloscMiejsc = iloscMiejsc;
    }

    public Crossover(int wielkoscKol, int iloscMiejsc)
    {
        super(wielkoscKol);
        this.iloscMiejsc = iloscMiejsc;
    }

    public Crossover(String marka, String model, int generacja, int cena, int wielkoscKol)
    {
        super(marka, model, generacja, cena, wielkoscKol);
    }

    public Crossover(String marka, String model, int generacja, int cena, int wielkoscKol, int iloscMiejsc)
    {
        super(marka, model, generacja, cena, wielkoscKol);
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    public String toString()
    {
        return "Crossover: {" + "marka='" + marka + '\'' + ", model='" + model +'\'' + ", generacja='" + generacja + '\'' +
                ", cena='" + cena + '\'' + ", wielkosc kol='" + wielkoscKol + " cali" + '\'' + ", ilosc miejsc siedzacych='" + iloscMiejsc + '\'' + '}';
    }
}
