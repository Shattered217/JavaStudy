package classwork;

// 电话类 Phone
class Phone {
    public String number;

    public void getNumber() {
        System.out.println("本机号码：" + number);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void dial() {
        System.out.println("正在拨打电话...");
    }

    public void answer() {
        System.out.println("正在接听电话...");
    }
}

class MobilePhone extends Phone {
    @Override
    public void dial() {
        System.out.println("正在通过移动网络拨打电话...");
    }

    @Override
    public void answer() {
        System.out.println("正在通过移动网络接听电话...");
    }
}

class FixPhone extends Phone {
    @Override
    public void dial() {
        System.out.println("正在通过固定网络拨打电话...");
    }

    @Override
    public void answer() {
        System.out.println("正在通过固定网络接听电话...");
    }
}

class CordlessPhone extends FixPhone {
    @Override
    public void dial() {
        System.out.println("正在通过无绳电话拨打电话...");
    }

    @Override
    public void answer() {
        System.out.println("正在通过无绳电话接听电话...");
    }

    public void move() {
        System.out.println("正在移动无绳电话...");
    }
}

public class Main {
    public static void main(String[] args) {
        // 测试移动电话
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setNumber("13812345678");
        mobilePhone.getNumber();
        mobilePhone.dial();
        mobilePhone.answer();

        System.out.println("\n");

        // 测试固定电话
        FixPhone fixPhone = new FixPhone();
        fixPhone.setNumber("01012345678");
        fixPhone.getNumber();
        fixPhone.dial();
        fixPhone.answer();

        System.out.println("\n");

        // 测试无绳电话
        CordlessPhone cordlessPhone = new CordlessPhone();
        cordlessPhone.setNumber("1234");
        cordlessPhone.getNumber();
        cordlessPhone.dial();
        cordlessPhone.answer();
        cordlessPhone.move();
    }
}

