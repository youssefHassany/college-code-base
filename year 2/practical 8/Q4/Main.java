class Books {
    public String title;
    public int numberOfPages;
}

public class Main {
    public static void main(String[] args) {
        Books bookOne = new Books();
        bookOne.title = "Atomic Habits";
        bookOne.numberOfPages = 200;

        Books bookTwo = new Books();
        bookTwo.title = "The Secret";
        bookTwo.numberOfPages = 180;

        Books bookThree = new Books();
        bookThree.title = "Animal Farm";
        bookThree.numberOfPages = 100;

        int[] arrayOfBooks = { bookOne.numberOfPages, bookTwo.numberOfPages, bookThree.numberOfPages };
        int totalPages = 0;

        for (int i = 0; i < arrayOfBooks.length; i++) {
            totalPages += arrayOfBooks[i];
        }

        System.out.println("Total Pages = " + totalPages); // 480
    }
}
