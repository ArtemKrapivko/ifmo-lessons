package test;

import fileStructure.File;
import fileStructure.types.media.MultimediaFile;
import fileStructure.types.media.Video;
import fileStructure.types.utils.Dimension;
import fileStructure.types.utils.Duration;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testDuration() {
        Duration d = new Duration(11, 11, 11);
        String output = d.toString();

        Assert.assertEquals("11:11:11", output);

        d = new Duration(0, 2, 31);
        Assert.assertEquals("00:02:31", d.toString());
    }

    @Test
    public void testVideoFileDesciption() {
        Video videoFile = new Video("Alex.avi", 332, "video", "Advantes",new Duration(0,9,43),new Dimension(34,53));
        Assert.assertEquals("video, Advantes, 00:09:43, 34x53", videoFile.getDetailInfo());
    }

    @Test
    public void testMultimediaFileDescription() {
        MultimediaFile mf = new MultimediaFile("Maria", 9, "mp3", "Eric Clapton, Pretty Girl",
                new Duration(0,12,21));
        Assert.assertEquals("mp3, Eric Clapton, Pretty Girl, 00:12:21", mf.getDetailInfo());
    }

    @Test
    public void testFileDescription() {
        File[] fileCollection = {
            new MultimediaFile("Maria", 9, "mp3", "Eric Clapton, Pretty Girl",
                    new Duration(0,12,21)),
            new Video("Alex.avi", 332, "video", "Advantes",
                    new Duration(0,9,43),new Dimension(34,53))
        };

        for (File f : fileCollection) {
            System.out.println(f.getDetailInfo());
        }
    }

}
