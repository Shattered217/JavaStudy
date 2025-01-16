package ZWU_Exams_2024;

public class Test1_2 {
    public static void main(String[] args){
        int result[]=new int[11]; //结果2到12有11种可能
        for(int i=0;i<3600;i++){
            int a=(int)Math.floor(Math.random()*6)+1; //Math.floor()返回小于等于参数的最大整数，即去掉小数点后的数
            int b=(int)Math.floor(Math.random()*6)+1; //Math.random()返回0.0到1.0之间的随机数，
                                                      // 所以*6代表0,6，+1代表1,7（左闭右开）
                                                      //(int)强制转换为整数
            int sum=a+b;
            result[sum-2]++; //sum最小值为2，但数组从0开始，所以减2
                             //即result[0]代表和为2的次数，result[10]代表和为12的次数
        }
        for(int j=2;j<13;j++){
            System.out.println(j+"出现的概率为"+(double)result[j-2]/3600); //j-2的原因同上
        }
    }
}
