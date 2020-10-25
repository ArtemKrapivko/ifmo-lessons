package fileStructure.types.media;

import fileStructure.File;
import fileStructure.types.utils.Dimension;

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

