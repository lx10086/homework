//编程实现键盘输入一个人的出生年份，计算出他一生能过几个闰年（以100岁为寿命长度）
import java.util.Scanner;
public class Chapter2num1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入此人的出生年份：");
        int year=scanner.nextInt();
        int num=0;
        for(int i=0;i<100;i++){
            if(year%400==0|(year%4==0&year%100!=0)){
                num++;
            }
            year++;
        }
        System.out.println("此人可以过"+num+"个闰年。");
    }
}
