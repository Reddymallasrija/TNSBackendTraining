class Book{
    String name;
    int id;
    String author;
    int price;
    int year;
    void print(){
        System.out.println("Book Details:\nName-"+name+"\nID-"+id+"\nAuthor-"+author+"\nPrice-"+price+"\nPublished Year-"+year);
    }
}
public class MainBook{
    public static void main(String[] args) {
        Book b=new Book();
        b.name="The art of not overthinking";
        b.id=19091;
        b.author="shurya kapoor";
        b.price=150;
        b.year=2001;
        b.print();
        Book b1=new Book();
        b1.name="Don't believe everything you think";
        b1.id=19092;
        b1.author="kaushik";
        b1.price=120;
        b1.year=1981;
        b1.print();
    }
}