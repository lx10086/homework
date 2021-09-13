//找到数组中所用的数组元素大于平均值的那些元素
import java.util.Scanner;
public class Chapter2num5 {
    public static void main(String[] args){
        System.out.println("输入数组元素的个数：");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("依次输入数组中的元素：");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int aver;   aver=sum/a;
        System.out.println("数组中比平均值大的元素有：");
        for(int i:arr){
            if(i>aver) System.out.println(i);
        }
    }
}
