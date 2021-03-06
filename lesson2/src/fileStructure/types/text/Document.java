package fileStructure.types.text;

import fileStructure.types.File;

public class Document extends File {
private int pages;

    public Document(String name, long size, String format, int pages) {
        super(name, size, format);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String getDetailInfo() {
        return this.getFormat() + ", " + this.pages + " pages";
    }

}
