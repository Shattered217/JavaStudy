package ZWU_Exams_2024;

class Complex{
    int realPart,imagPart;
    public Complex(int realPart,int imagPart){
        this.realPart=realPart;
        this.imagPart=imagPart;
    }
    public static void add(Complex a1, Complex b1){
        int add1=a1.realPart+b1.realPart;
        int add2=a1.imagPart+b1.imagPart;

        if(add2<0) {
            System.out.println(add1+""+add2+"i");
        }
        else{
            System.out.println(add1+"+"+add2+"i");
        }
    }
}

public class Test2_1 {
    public static void main(String[] args) {
        Complex a1 = new Complex(18,2);
        Complex a2 = new Complex(19,-13);

        Complex.add(a1,a2);
    }
}
