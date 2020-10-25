public class Main {

    public static void main(String[] args) {

        File[] pp = {
                new Document("NameManame", 34, "BMP", 334),
                new Image("Sergey", 332, "JPG", new Dimension(33,23)),
                new MultimediaFile("Maria", 9, "BMP", "drive-drove-driven","testNewDuration"),
                new Video("Alex", 332, "Comp", "Advantes","durationTest",new Dimension(34,53))
        };
        File.printAll(pp);
    }
}

