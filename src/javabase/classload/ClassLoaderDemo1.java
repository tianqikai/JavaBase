package javabase.classload;

/**
 *
 */
public class ClassLoaderDemo1 {
    public static void main(String[] args) throws Exception {
        // 父子关系 AppClassLoader <- ExtClassLoader <- BootStrap Classloader
        ClassLoader cl1=ClassLoaderDemo1.class.getClassLoader();
        System.out.println("cl1>: "+cl1);
        System.out.println("parent of cl1>: "+cl1.getParent());
        //BootStrap Classloader 由c++开发，是JVM虚拟机的一部分，本身不是JAVA
        System.out.println("grant parent of cl1>: "+ cl1.getParent().getParent());
        // String,Int等基础类是由BootStrap Classloader加载
        ClassLoader cl2 =String.class.getClassLoader();
        System.out.println("cl2>: "+cl2);
        System.out.println(cl1.loadClass("java.util.List").getClass().getClassLoader());


        //java命令可以通过增加 -verbose:class -verbose:gc 参数在启动时打印出类加载情况
        // BootStrap Classloader,加载java基础类，这个属性不能在java指令中指定，推断不是由java语言处理的
        System.out.println("BootStrap Classloader加载目录："+System.getProperty("sun.boot.class.path"));
        // Extention Classloader 加载JAVA_HOME/ext下的jar包。可通过-D java.ext.dirs另行指定目录
        System.out.println("Extention Classloader加载目录："+System.getProperty("java.ext.dirs"));
        // APPClassLoader   加载CLASSPATH应用下的jar包。可通过-D java.class.path另行指定目录
        System.out.println("APPClassLoader加载目录："+System.getProperty("java.class.path"));
    }
}
