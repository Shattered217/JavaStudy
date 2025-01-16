package ZWU_Exams_2024;

public class Test5_2 {
    public static void main(String[] args){
        String str="23 10 -8 0 3 7 108";
        String[] array=str.split(" ");
        int number[]=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            number[i]=Integer.parseInt(array[i]);
        }
        int temp;
        for(int i=0;i<number.length;i++){
            for(int j=1;j<number.length;j++){
                if(number[j]<number[j-1]){
                    temp=number[j];
                    number[j]=number[j-1];
                    number[j-1]=temp;
                }
            }
        }
        for(int i=0;i<number.length;i++) {
            System.out.print(number[i]+" ");
        }

        int downnumber[]=new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            downnumber[i]=Integer.parseInt(array[i]);
        }

        System.out.println("");

        for(int i=0;i<downnumber.length;i++){
            for(int j=1;j<downnumber.length;j++){
                if(downnumber[j]>downnumber[j-1]){
                    temp=downnumber[j];
                    downnumber[j]=downnumber[j-1];
                    downnumber[j-1]=temp;
                }
            }
        }
        for(int i=0;i<downnumber.length;i++) {
            System.out.print(downnumber[i]+" ");
        }
    }
}
