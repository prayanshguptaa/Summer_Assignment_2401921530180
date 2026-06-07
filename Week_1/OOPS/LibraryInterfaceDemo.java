interface LibraryUser {
    void registerAccount(int age);
    void requestBook(String bookType);
}

class KidUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(int age){
        if(age <= 12) System.out.println("You have successfully registered under a Kids Account");
        else System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
    public void requestBook(String bookType){
        if(bookType == "Kids") System.out.println("Book Issued successfully, please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books");
    }
}

class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(int age){
        if(age > 12) System.out.println("You have successfully registered under an Adult Account");
        else System.out.println("Sorry, Age must be greater than 12 to register as an adult");
    }
    public void requestBook(String bookType){
        if(bookType == "Fiction") System.out.println("Book Issued successfully, please return the book within 7 days");
        else System.out.println("Oops, you are allowed to take only adult Fiction books");
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args){

        //TestCase 1
        KidUser kid1 = new KidUser();
        KidUser kid2 = new KidUser();
        kid1.age = 10;
        kid2.age = 18;
        kid1.registerAccount(kid1.age);
        kid2.registerAccount(kid2.age);

        kid1.bookType = "Kids";
        kid2.bookType = "Fiction";
        kid1.requestBook(kid1.bookType);
        kid2.requestBook(kid2.bookType);

        //TestCase 2
        AdultUser adult1 = new AdultUser();
        AdultUser adult2 = new AdultUser();
        adult1.age = 5;
        adult2.age = 23;
        adult1.registerAccount(adult1.age);
        adult2.registerAccount(adult2.age);

        adult1.bookType = "Kids";
        adult2.bookType = "Fiction";
        adult1.requestBook(adult1.bookType);
        adult2.requestBook(adult2.bookType);
    }
}
