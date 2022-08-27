

public class Main {
    public static void main() {

        Author author1 = new Author("Александр", "Блок");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Незнакомка", author1, 1839);
        Book book2 = new Book("Метель", author2, 1830);
        book1.setYearOfPublication(1923);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);

    }
}

