package fileStructure.types.media;

import fileStructure.types.utils.Dimension;
import fileStructure.types.utils.Duration;

public class Video extends MultimediaFile {
    private Dimension dimension;

    public Video(String name, long size, String format, String descr, Duration duration, Dimension dimension) {
        super(name, size, format, descr, duration);
        this.dimension = dimension;
    }

    @Override
    public String getDetailInfo() {
        return dimension.toString();
    }
}
