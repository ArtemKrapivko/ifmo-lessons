package types.media;

import types.File;
import types.utils.Duration;

public class MultimediaFile extends File {
    private String[] descr;
    private Duration duration;

    public MultimediaFile(String name, long size, String format, String[] descr, Duration duration) {
        super(name, size, format);
        this.descr = descr;
        this.duration = duration;
    }

    public String[] getDescr() {
        return descr;
    }

    public void setDescr(String[] descr) {
        this.descr = descr;
    }

//    public String getDuration() {
//        return duration;
//    }

//    public void setDuration(String duration) {
//        this.duration = duration;
//    }


    private String printDescr() {
        StringBuilder sbd = new StringBuilder();
        for (String a : this.descr) {
            sbd.append(a);
            sbd.append(",");
        }
        return sbd.toString();
    }

    @Override
    protected String getDetailInfo() {
        return  printDescr() + " " + duration;
//        return getName() + " | " + getSize() + " | " + getFormat() + " | " +  descr + " " + duration;
    }
}
