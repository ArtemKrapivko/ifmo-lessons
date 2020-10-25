public class Main {
    public static void main(String[] args) {


        Izdatelstvo izdBHV = new Izdatelstvo("БХВ", "Сант-Петебург"),
                izdPiter = new Izdatelstvo("Питер", "Санкт-Петербург"),
                izdPRSPEKT = new Izdatelstvo("Проспект", "Москва"),
                izdDialect = new Izdatelstvo("Диалектика", "Киев");
//                izdDialect = new Izdatelstvo("", "");


        BookInfo[] bookInfo = {
                new BookInfo(new String[]{"Мартин Роберт"}, "Чистый код:создание, анализ и рефакторинг", izdPiter, 2018),
                new BookInfo(new String[]{"Вигерс Карл"}, "Разработка требований к программному обеспечению. 3 - е издание,дополненное", izdBHV, 2019),
                new BookInfo(new String[]{"Шилдт Герберт"}, "Java.Полное руководство, 10 - е издание", izdDialect, 2018),
                new BookInfo(new String[]{"Полубенцева М.И."}, "C / C++.Процедурное программирование", izdBHV, 2017),
                new BookInfo(new String[]{"Неизвестный И.В.", "Известный В.И."}, "C / C++.Процедурное программирование", izdBHV, 2017),
                new BookInfo(null, "Конституция РФ", izdPRSPEKT, 2020)
        };
        printAll(bookInfo);
        izdBHV.setIzdatelCity("Санкт-Петербург");
        printAll(bookInfo);
    }
// вывод изменился, т.к. переопределил значение. В этом случае определяю свойство как бы с нуля.
// Старый геттер вызывается, но на этапе печати задаю новое значение и вывожу уже исправленное значение
// потому что несколько книг имеют одинаковый аттрибут, который поменялся.


    private static void printAll(BookInfo[] bookInfo) {
        for (BookInfo c : bookInfo)
            c.print();
        System.out.println();

    }
}
