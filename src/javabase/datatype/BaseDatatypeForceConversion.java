package javabase.datatype;
import java.math.BigDecimal;

/**
 * BaseDatatypeForceConversion :
 * @description:强制类型转换
 * @author: tianqikai
 * @date : 2021/4/16 0016
 */
public class BaseDatatypeForceConversion {
    public static void main(String[] args) {
        //强制类型转换，会存在精度缺失情况，尽量避免使用；实际商业开发中，存在计算是，一般使用BigDecimal类处理；
        int i;
        long l=10000L;
        i=(int)l;
        System.out.println(i);
        float f;
        double d=1000.1111;
        f=(float)d;
        System.out.println(f);

        BigDecimal bigDecimal=new BigDecimal(l);

        bigDecimal=bigDecimal.add(new BigDecimal(i));
        System.out.println(bigDecimal);
        //任何类型和string拼接之后变成，string类型；
        String s="String类型字符串对象";
        s=s+l;
        System.out.println(s);

    }
}
