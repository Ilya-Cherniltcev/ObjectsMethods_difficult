package skyPro;

public class Main {
// ====================  ОБЪЕКТЫ И КЛАССЫ ======== Средний уровень ===============================
    public static void main(String[] args) {
        Book[] book = new Book[10];
        book[3] = new Book("Три мушкетера", "А.Дюма", 1958);
        book[5] = new Book("Обратная строна луны", "Т.Бочкова", 2015);
        addBook(book, "Кукушка", "Н.Дэниелс", 2010);
        addBook(book, "Хоббит", "Дж.Толкиен", 2001);
        addBook(book, "The Stand", "Stephen King", 1978);
        addBook(book, "Гарри Поттер и философский камень", "Дж.К.Роулинг", 2020);
        addBook(book, "Семиевие", "Н.Стивенсон", 2021);
        printBooks(book);

    }

    public static void addBook(Book[] book, String title, String name, int year) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Book(title, name, year);
                return;
            }
        }
        throw new RuntimeException("Все ячейки массива заполнены!");
    }

    public static void printBooks(Book[] book) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                System.out.println(book[i]);
            }
        }
    }
}
