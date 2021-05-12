package javabase.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName：PropertiesTest
 * @description:
 * @author: tianqikai
 * @date : 0:50 2021/5/10
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        File file=new File("E:\\GIT\\JavaBase\\src\\test.text");
        if(file.exists()==false){
            System.out.println("文件不存在！");
        }
        FileInputStream fileInputStream=new FileInputStream(file);
        properties.load(fileInputStream);
        String http = properties.getProperty("http");
        System.out.println(http);
    }
}
