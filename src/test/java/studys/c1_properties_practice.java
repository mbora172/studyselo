package studys;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c1_properties_practice {

    @Test
    public void TC1_System_properties(){

        //java has some properties that we can get as a system info
        System.out.println(System.getProperty("os.name"));
    }
 @Test
    public void configurationProperties() throws FileNotFoundException {
        Properties properties=new Properties();
        String pathForPropertiesFile= "src/main/configuration.properties";

        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
        try {
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
        System.out.println(properties.getProperty("SmartBear_password"));
     }







}
