package runoob;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b); // 调用swap方法
        // the swap method did not change the value of a and b, just duplicate the value a and b to x and y. 
        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值
    }
       
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
    
}
