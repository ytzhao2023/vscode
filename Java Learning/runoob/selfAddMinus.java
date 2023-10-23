package runoob;

public class selfAddMinus {
    public static void main(String[] args){
        int a = 5;//定义一个变量；
        int b = 5;
        int x = ++a; // first a++ = 6, then x = a = 6
        int y = b++; // first y = b = 5, then b++ = 6
        //int x = 2*++a;
        //int y = 2*b++;
        System.out.println("自增运算符前缀运算后a="+a+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b+",y="+y);
    }
}

