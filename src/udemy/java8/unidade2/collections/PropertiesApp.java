package udemy.java8.unidade2.collections;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception {
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:/eclipse-workspace/udemy.java8.unidade2/src/udemy/java8/unidade2/collections/sites.xml"));
		System.out.println(sites.getProperty("2"));
	}

}
