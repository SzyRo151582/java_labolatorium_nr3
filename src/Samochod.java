public class Samochod
{
    protected String marka;
    protected String model;
    protected int generacja;
    protected int cena;
    private boolean czyProdukowany;

    public Samochod()
    {
        this.marka = "";
        this.model = "";
        this.generacja = 0;
        this.cena = 0;
        czyProdukowany = true;
    }

    public Samochod(String marka, String model, int generacja, int cena)
    {
        this.marka = marka;
        this.model = model;
        this.generacja = generacja;
        this.cena = cena;
        czyProdukowany = true;
    }

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getGeneracja()
    {
        return generacja;
    }

    public void setGeneracja(int generacja)
    {
        this.generacja = generacja;
    }

    public int getCena()
    {
        return cena;
    }

    public void setCena(int cena)
    {
        this.cena = cena;
    }

    public boolean isCzyProdukowany()
    {
        return czyProdukowany;
    }

    public void setCzyProdukowany(boolean czyProdukowany)
    {
        this.czyProdukowany = czyProdukowany;
    }

    @Override
    public String toString()
    {
        return "Samochod: {" + "marka='" + marka + '\'' + ", model='" + model + '\'' + ", generacja='" + generacja + '\'' +
                ", cena='" + cena + '\'' + ", czyProdukowany='" + (czyProdukowany ? "Tak" : "Nie") + '}';
    }
}
