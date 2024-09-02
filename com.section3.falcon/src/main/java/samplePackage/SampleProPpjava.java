package samplePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class SampleProPpjava {
public static void main(String[] args) throws Exception {
	FileInputStream f = new FileInputStream("D:\\Jigya\\Selenium\\CommonData.properties");
	Properties p = new Properties();
	p.load(f);
	String URL= p.getProperty("url");
	String UNAME= p.getProperty("username");
	String PASS = p.getProperty("password");
	System.out.println(URL);
	System.out.println(UNAME);
	System.out.println(PASS);
}
}
