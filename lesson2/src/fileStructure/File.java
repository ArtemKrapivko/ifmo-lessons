package fileStructure;

public abstract class File {
    private String name;
    private long size;
    private String format;

    public File(String name, long size, String format) {
        this.name = name;
        this.size = size;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    protected abstract String getDetailInfo();
}
