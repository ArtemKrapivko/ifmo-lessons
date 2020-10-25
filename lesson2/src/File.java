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


//    public void print() {
//        System.out.println(name + " | " + size + " | " + format + " | ");
//        System.out.println(getDetailInfo());
//    }

    protected abstract String getDetailInfo();

    public static void printAll(File[] pp) {
        System.out.println(" File name " + " | " + " Size " + " | " + " Details ");
                    System.out.println();
        for (File p : pp) {
            System.out.println(p.name + " | " + p.size + " | " + p.format + " | " + p.getDetailInfo());
//            p.print();
//            System.out.println();

        }
    }





}
