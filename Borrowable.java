public interface Borrowable{
    void borrowedItem();
    void returnItem();

    default String getBorrowingStatus() {
        return "Available for Borrowing : Currently Borrowed";

    }
}
