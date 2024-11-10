package homework;

class Account{
    private String name;
    private int account;
    private double balance;
    public Account(String name, int account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }
    public void show(){
        System.out.println("姓名："+name+" 账号："+account+" 余额："+balance);
    }
    public void change(double money){
        if (money>0){
            System.out.println("存款"+money+"元");
            balance+=money;
        }
        else if (money<0){
            if (balance+money<0) {
                System.out.println("余额不足，取款失败");
                return;
            }
            else {
                System.out.println("取款" + (-money) + "元");
                balance += money;
            }
        }

    }
}

public class BankAccount {
    public static void main(String[] args) {
    Account a1=new Account("张三",123456,1000);
    Account a2=new Account("李四",654321,2000);
    a1.show();
    a1.change(500);
    a1.show();
    a2.show();
    a2.change(-3000);
    a2.change(-1000);
    a2.show();
    }
}
