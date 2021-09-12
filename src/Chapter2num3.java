//用辗转相除法求两个整数的最大公因数
import java.util.Scanner;
public class Chapter2num3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入两个整数：");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=a; int d=b;
        int r=c%d;
        while(r!=0){
            c=d;
            d=r;
            r=c%d;
        }
        System.out.println(a+"和"+b+"的最大公约数为："+d);
    }
}
