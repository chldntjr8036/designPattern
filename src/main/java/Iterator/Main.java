package Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bs = new BookShelf(4);
        bs.appendBook(new Book("1"));
        bs.appendBook(new Book("2"));
        bs.appendBook(new Book("3"));
        bs.appendBook(new Book("4"));
        Iterator it = bs.iterator();
        while(it.hasNext()){
            Book b = (Book)it.next();
            System.out.println(b);
        }
    }
}
