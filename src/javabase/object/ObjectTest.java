package javabase.object;
/**
 * @ClassName：ObjectTest
 * @description:
 * @author: tianqikai
 * @date : 23:49 2021/4/27
 */
public class ObjectTest {
    public static void main(String[] args) {
        int a=new Integer(111);
        test();
    }
    public static void test() {
        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//abc 内容
        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//地址
        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//地址
    }
}
