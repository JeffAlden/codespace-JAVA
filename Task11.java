public class Task11 {
    class Book {
        String title;
        String author;
        int yearPublished;
        double price;
    
        public Book(String title, String author, int yearPublished, double price) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
        }
    
        @Override
        public String toString() {
            return "Title: \"" + title + "\"\n" +
                   "Author: \"" + author + "\"\n" +
                   "Year Published: " + yearPublished + "\n" +
                   "Price: $" + price;
        }
    
        }
    
        public static void main(String[] args) {
            Task11 task = new Task11();
            Book book1 = task.new Book("Java Programming", "John Smith", 2021, 39.99);
            Book book2 = task.new Book("Python Basics", "Jane Doe", 2020, 29.99);
            Book book3 = task.new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
    
            System.out.println("Book 1:\n" + book1);
            System.out.println("\nBook 2:\n" + book2);
            System.out.println("\nBook 3:\n" + book3);
        }
    }
