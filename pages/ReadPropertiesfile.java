package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;

public class ReadPropertiesfile {
	
	public static Properties prop = new Properties();
	
	 public static void main(String[] args)  {
		 
		
		  File file = new File("C:\\Users\\Kuliza-363\\NewWorkspace\\Automation Testing\\src\\pages\\sconfig.properties");
		  
		 
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			//load properties file
			 try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	 }

}
