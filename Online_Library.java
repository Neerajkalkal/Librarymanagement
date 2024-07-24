class library {
        String[] books;
        int no_of_books;

        library() {
            this.books = new String[100];
            this.no_of_books = 0;
        }

          void addBook(String book){
                this.books[no_of_books] = book;
               this.no_of_books++;
              System.out.println(book + " has been added!");
            }

            void availableBook(){
                System.out.println();
                System.out.println("Available Books are : ");
                for (String books : this.books){
                   if(books == null){
                       continue;
                   }
                    System.out.println("* "+ books);
                }
            }

            void issueBook(String book){
                System.out.println();
                for(int i = 0; i < this.books.length; i++){
                    if(this.books[i].equals(book)){
                        System.out.println(book +" the book has been issued!");
                        this.books[i] = null;
                        return;
                    }
                }
                System.out.println("This book does not exist");
            }

            void returnBook(String book){
                System.out.println();
                addBook(book);
            }
}
public class Online_Library {
    public static void main(String[] args) {
        library lib = new library();
        lib.addBook("Power");
        lib.addBook("Think Grow Rich");
        lib.addBook("Rich dad Poor dad");
        lib.addBook("C++");
        lib.addBook("DSA");
        lib.availableBook();
        lib.issueBook("Power");
        lib.availableBook();
        lib.returnBook("Power");
        lib.availableBook();
    }
}