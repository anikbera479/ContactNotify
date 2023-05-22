package utilities;

import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;


public class Readpopertyfiles {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\sele\\src\\test\\resources\\configfiles\\config.property");
		Properties p=new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
		// TODO Auto-generated method stub

	}

}
