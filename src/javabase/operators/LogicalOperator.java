package javabase.operators;
/**
 * @program: LogicalOperator
 * @description:  逻辑运算符
 * @author: tianqikai
 **/
public class LogicalOperator {
    public static void main(String[] args) {
        logicalOne();
        logicalTwo();
        logicalThree();
        logicalFour();
    }
    /***
     * @classname : logicalOne
     * @description:
     */
    public static void logicalOne(){
        int x = 1;
        int y=1;
        if(x++==2 & ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        //x=2,y=7
    }
    /***
     * @classname : logicalTwo
     * @description:
     */
    public static void logicalTwo(){
        int x = 1,y = 1;
        if(x++==2 && ++y==2){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        //x=2,y=2
    }
    /***
     * @classname : logicalThree
     * @description:
     */
    public static void logicalThree(){
        int x = 1,y = 1;
        if(x++==1 | ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        // x=7,y=2
    }
    /***
     * @classname : logicalFour
     * @description:
     */
    public static void logicalFour(){
        int x = 1,y = 1;
        if(x++==1 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        //x=7,y=1
    }
}
