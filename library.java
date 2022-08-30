class library01{
    String[] books;
    int num;
    library01(){
        books = new String[100];
        num=0;
    }
    void addbooks(String book){
        books[num]=book;
        num++;
        System.out.println(book+" has been added !");
    }
    void issuebooks(String book){
        for(int i=0;i<books.length;i++){
            if(books[i]==book){
                System.out.println("The "+book+" has been issued !");
                books[i]=null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }
    void showbooks(){
        System.out.println("Available Books : ");
        for(int i=0;i<books.length;i++){
            if(books[i]==null){
                continue;
            }
            System.out.println("* "+books[i]);
        }
    }
    void returnbooks(String book){
        addbooks(book);
    }
}
public class library {
    public static void main(String[] args) {
        library01 lib=new library01();
        lib.addbooks("Java");
        lib.addbooks("Linux by Linus");
        lib.addbooks("Programing in C");
        lib.addbooks("Depth C++");
        lib.showbooks();
        lib.issuebooks("Java");
        lib.showbooks();
        lib.returnbooks("Java");
        lib.showbooks();
    }
}
