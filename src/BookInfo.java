public class BookInfo {
    private String name;
    private Izdatelstvo izdatelstvo;
    private Integer year;
    private String[] author;


    public BookInfo(String[] author, String name, Izdatelstvo izdatelstvo, Integer year) {
        this.author = author;
        this.name = name;
        setIzdatelstvo(izdatelstvo);
        setYear(year);
    }

    public Izdatelstvo getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(Izdatelstvo izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    public String getLine() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null) || name.equals(""))
            throw new IllegalArgumentException("name incorrect");
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0)
            throw new IllegalArgumentException("year incorrect");
        this.year = year;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;

    }


    public void print() {
        if (author == null) {
            System.out.println("nazvanie= " + name + "; year= " + year + "; izdatelstvo= " + izdatelstvo.getIzdate1Name() + "; city of izdatelstvo= " + izdatelstvo.getIzdatelCity());
        } else {
            System.out.println("nazvanie= " + name + "; year= " + year + "; author= " + printAuthor() + "; izdatelstvo= " + izdatelstvo.getIzdate1Name() + "; city of izdatelstvo= " + izdatelstvo.getIzdatelCity());

        }
    }


    private String printAuthor() {
        StringBuilder sb = new StringBuilder();
        for (String a : this.author) {
            sb.append(a);
            sb.append(",");
        }
        return sb.toString();
    }
}

