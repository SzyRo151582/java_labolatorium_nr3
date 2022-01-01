public class SUV extends Samochod
{
    protected int wielkoscKol;

    public SUV()
    {
        super();
        this.wielkoscKol = 0;
    }

    public SUV(int wielkoscKol)
    {
        this.wielkoscKol = wielkoscKol;
    }

    public SUV(String marka, String model, int generacja, int cena, int wielkoscKol)
    {
        super(marka, model, generacja, cena);
        this.wielkoscKol = wielkoscKol;
    }

    public int getWielkoscKol()
    {
        return wielkoscKol;
    }

    public void setWielkoscKol(int wielkoscKol)
    {
        this.wielkoscKol = wielkoscKol;
    }

    @Override
    public String toString()
    {
        return "SUV: {" + "marka='" + marka + '\'' + ", model='" + model +'\'' + ", generacja='" + generacja + '\'' +
                ", cena='" + cena + '\'' + ", wielkosc kol='" + wielkoscKol + " cali" + '\'' + '}';
    }
}
