package types.media;

import types.media.MultimediaFile;
import types.utils.Dimension;
import types.utils.Duration;

public class Video extends MultimediaFile {
    private Dimension dimension;

    public Video(String name, long size, String format, String[] descr, Duration duration, Dimension dimension) {
        super(name, size, format, descr, duration);
        this.dimension = dimension;
    }

    @Override
    protected String getDetailInfo() {
        return dimension.toString();
//        return getName() + " name " + getSize() + " size " + getFormat() + " format" + dimension +"." ;

    }
}
