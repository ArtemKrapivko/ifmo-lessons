package types.media;

import types.File;
import types.utils.Dimension;

public class Image extends File {
private Dimension dimension;

    public Image(String name, long size, String format, Dimension dimension) {
        super(name, size, format);
        this.dimension = dimension;
    }


    @Override
    protected String getDetailInfo() {
//        return "" + dimension;
        return dimension.toString();
//        return getName() + " | " + getSize() + " | " + getFormat() + " |" + dimension;
    }


}

