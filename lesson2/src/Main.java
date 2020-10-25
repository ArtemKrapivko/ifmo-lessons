import types.*;
import types.media.Image;
import types.media.MultimediaFile;
import types.media.Video;
import types.text.Document;
import types.utils.Dimension;

public class Main {

    public static void main(String[] args) {

        File[] pp = {
                new Document("NameManame", 34, "BMP", 334),
                new Image("Sergey", 332, "JPG", new Dimension(33,23)),
                new MultimediaFile("Maria", 9, "BMP", "drive-drove-driven","testNewDuration"),
                new Video("Alex", 332, "Comp", "Advantes","durationTest",new Dimension(34,53))
        };
    }

    public static void printAll(File[] pp) {
        System.out.println(" types.File name " + " | " + " Size " + " | " + " Details ");
        System.out.println();
        for (File p : pp) {
//            System.out.println(p.name + " | " + p.size + " | " + p.format + " | " + p.getDetailInfo());


        }
    }



}

