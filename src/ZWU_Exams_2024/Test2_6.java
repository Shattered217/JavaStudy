package ZWU_Exams_2024;

class BankAccount{
    String BankAccount_name;
    int BankAccount_num;
    double BankAccount_saves,saveMoney,getMoney;
    public BankAccount(String BankAccount_name,int BankAccount_num,double BankAccount_saves){
        this.BankAccount_name=BankAccount_name;
        this.BankAccount_num=BankAccount_num;
        this.BankAccount_saves=BankAccount_saves;
    }
    public void cunkuan(double saveMoney){
        this.saveMoney = saveMoney;
        BankAccount_saves = BankAccount_saves+saveMoney;
    }
    public void qukuan(double getMoney){
        this.getMoney = getMoney;
        BankAccount_saves = BankAccount_saves-getMoney;
    }
    public void query(){
        System.out.print("账户名"+BankAccount_name);
        System.out.print("账户号"+BankAccount_num);
        System.out.println("余额"+BankAccount_saves);
    }
}

public class Test2_6 {
    public static void main(String[] args){
        BankAccount a1 = new BankAccount("sb",114514,2000);
        BankAccount a2 = new BankAccount("nc",54114,3000);
        a1.query();
        a2.query();
        a1.cunkuan(200);
        a2.qukuan(500);
        a1.query();
        a2.query();
    }
}
