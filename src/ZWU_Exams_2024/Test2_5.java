package ZWU_Exams_2024;

class Book{
    String book_name,book_writer;double book_sales;
    public void setBook(String book_name,String book_writer,double book_sales){
        this.book_name = book_name;
        this.book_writer = book_writer;
        this.book_sales = book_sales;
    }
    public void printBook(){
        System.out.println("书名"+book_name);
        System.out.println("作者"+book_writer);
        System.out.println("月销量"+book_sales);
    }
}

public class Test2_5 {
    public static void main(String[] args){
        Book a1 = new Book();
        Book a2 = new Book();
        a1.setBook("nmsl","sunxiaochaun",114);
        a2.setBook("sb","dhy",514);
        a1.printBook();
        a2.printBook();
    }
}
