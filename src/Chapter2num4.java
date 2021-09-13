//统计一个字符数组中每个字母出现的次数
//原有长度减去替换后的长度就是该字母的个数
public class Chapter2num4 {
    public static void main(String[] args){
        String str = "hello world";
        int length = 0;
        while(str.length()>0) {
            String first = String.valueOf(str.charAt(0));//将第一个字母变为字符串
            String newString = str.replaceAll(first, "");//将第一个字符相同的替换为空字符串
            length = str.length() - newString.length();
            str = newString;
            System.out.print(first + ":" + length + "    ");
        }
    }
}
