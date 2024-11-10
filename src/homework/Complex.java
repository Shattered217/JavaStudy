package homework;
class Complex1{
    public int realPart;
    public int imagPart;
    public Complex1() {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }
}


public class Complex {
    public static void main(String[] args) {
        Complex1 c1 = new Complex1();
        Complex1 c2 = new Complex1();
        c1.realPart = 18;
        c1.imagPart = 2;
        c2.realPart = 19;
        c2.imagPart = -13;
        int sumReal = c1.realPart + c2.realPart;
        int sumImag = c1.imagPart + c2.imagPart;
        System.out.println("相加结果: " + sumReal + (sumImag >= 0 ? "+" : "") + sumImag + "i");

        int diffReal = c1.realPart - c2.realPart;
        int diffImag = c1.imagPart - c2.imagPart;
        System.out.println("相减结果: " + diffReal + (diffImag >= 0 ? "+" : "") + diffImag + "i");
    }
}
