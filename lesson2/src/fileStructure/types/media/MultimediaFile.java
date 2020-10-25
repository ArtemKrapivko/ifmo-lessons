package fileStructure.types.media;

import fileStructure.File;
import fileStructure.types.utils.Duration;

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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String getDetailInfo() {
        return  this.getFormat() + ", " + this.descr + ", " + this.duration;
    }
}
