//随机产生20个[77~459）正整数存放到数组中，求数组中的最大值，最小值，平均值及各个元素之和
public class Chapter2num6 {
    public static int[] CreateArr(int n){
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(70+Math.random()*(459-77+1));
        }
        return arr;
    }
    public static void main(String[] args){
        int []arr=CreateArr(20);
        System.out.println("随机生成的数组为：");
        int max=arr[0],min=arr[0],sum=0,aver,temp;
        for(int i:arr){
            System.out.print(i+"   ");
            if(i>max){temp=max;max=i;i=temp;}
            if(i<min){temp=min;min=i;i=temp;}
            sum+=i;
        }
        aver=sum/20;
        System.out.println(   );
        System.out.print("该数组的最大值为:"+max);
        System.out.print("      最小值为:"+min);
        System.out.print("      平均值为:"+aver);
        System.out.print("      元素之和为:"+sum);
    }
}
