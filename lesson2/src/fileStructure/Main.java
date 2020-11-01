package fileStructure;

import fileStructure.types.File;
import fileStructure.types.media.Image;
import fileStructure.types.media.MultimediaFile;
import fileStructure.types.media.Video;
import fileStructure.types.text.Document;
import fileStructure.types.utils.Dimension;
import fileStructure.types.utils.Duration;

public class Main {

    public static void main(String[] args) {

        File[] pp = {
                new Document("j110-lab2-hiers.docx", 23212, "docx",2),
                new Image("spb-map.png", 1703527, "image", new Dimension(1024,3072)),
                new MultimediaFile("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", new Duration(0,5,28)),
                new Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985",new Duration(1,48,8),new Dimension(640,352))
        };

        printAll(pp);
        System.out.println();
        Document[] dd = {
                new Document("j110-lab2-hiers.docx", 23212, "docx",2),
                new Document("j110-lab2-hiers.docx", 23212, "docx",2)
        };
        printAll(dd);
    }



    public static void printAll(File[] pp) {
        int maxNameLength = getMaxFilenameLength(pp);
        int maxSizeLength = getMaxSizeLength(pp);

        String formatTitle = "%-"+ maxNameLength + "s|%-" + maxSizeLength + "s|%s";
        String formatData = "%-"+ maxNameLength + "s|%" + maxSizeLength + "s|%s";

        String title = String.format(formatTitle, "File name", "Size", "Details");
        System.out.println(title + "\n");
        for (File p : pp) {
            System.out.println(String.format(formatData, p.getName(), p.getSize(), p.getDetailInfo()));
        }
    }

    private static int getMaxSizeLength(File[] pp) {
        int maxLength = 0;
        for (File p : pp) {
            int cur = String.valueOf(p.getSize()).length();
            if (cur > maxLength) {
                maxLength = cur;
            }
        }
        return maxLength;
    }

    private static int getMaxFilenameLength(File[] pp) {
        int maxLength = 0;
        for (File p : pp) {
            if (p.getName().length() > maxLength) {
                maxLength = p.getName().length();
            }
        }
        return maxLength;
    }


}

