package ZWU_Exams_2024;

public class Test5_1 {
    public static void main(String[] args){
        String str="asfasfnabaasdfnbasdnbasnbasdnbadfasdf";
        int m = 0;
        int n=-1;
        while((n=str.indexOf("nba",(n+1)))!=-1) {
            m++;
                System.out.println("第 "+m+" 次出现的位置："+n);
        }
    }
}

