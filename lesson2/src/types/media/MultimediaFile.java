package types.media;

import types.File;
import types.utils.Duration;

public class MultimediaFile extends File {
    private String descr;
    private Duration duration;

    public MultimediaFile(String name, long size, String format, String descr, Duration duration) {
        super(name, size, format);
        this.descr = descr;
        this.duration = duration;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    protected String getDetailInfo() {
        return  descr + " " + duration;
//        return getName() + " | " + getSize() + " | " + getFormat() + " | " +  descr + " " + duration;
    }
}
