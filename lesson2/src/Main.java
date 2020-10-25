import types.*;
import types.media.Image;
import types.media.MultimediaFile;
import types.media.Video;
import types.text.Document;
import types.utils.Dimension;
import types.utils.Duration;

public class Main {

    public static void main(String[] args) {

        File[] pp = {
                new Document("NameManame", 34, "BMP", 334),
                new Image("Sergey", 332, "JPG", new Dimension(33,23)),
                new MultimediaFile("Maria", 9, "BMP", "drive-drove-driven",new Duration(11,11,21)),
                new Video("Alex", 332, "Comp", "Advantes",new Duration(0,9,43),new Dimension(34,53)),

                new Document("j110-lab2-hiers.docx", 23212, "",2),
                new Image("spb-map.png", 1703527, "", new Dimension(1024,3072)),
                new MultimediaFile("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", new Duration(00,05,28)),
                new Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985",new Duration(1,48,8),new Dimension(640,352))
        };
    }



    public static void printAll(File[] pp) {
        System.out.println(" types.File name " + " | " + " Size " + " | " + " Details ");
        System.out.println();
        for (File p : pp) {

        }
    }



}

