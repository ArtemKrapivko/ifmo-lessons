public class Izdatelstvo {
    private String Izdate1Name;
    private String IzdatelCity;

    public Izdatelstvo(String izdate1Name, String izdatelCity) {
        this.Izdate1Name = izdate1Name;
        this.IzdatelCity = izdatelCity;
    }

    public String getIzdate1Name() {
        return Izdate1Name;
    }


    public void setIzdate1Name(String izdate1Name) {
        if (izdate1Name.equals(null) || izdate1Name.equals(""))
            throw new IllegalArgumentException("izdate1Name incorrect");
        this.Izdate1Name = izdate1Name;
    }



    public String getIzdatelCity() {
        return IzdatelCity;
    }

    public void setIzdatelCity(String izdatelCity) {
        if (izdatelCity.equals(null) || izdatelCity.equals(""))
            throw new IllegalArgumentException("izdatelCity incorrect");
        this.IzdatelCity = izdatelCity;
    }



}
