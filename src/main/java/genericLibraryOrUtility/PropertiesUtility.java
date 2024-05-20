package genericLibraryOrUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this is the utility class to deal with properties file
 * @author Vipul
 * @version 5.1.1
 */

public class PropertiesUtility {
/**
 * this is a generic method to read data from properties
 * @param data
 * @return
 * @throws Exception
 */

	public String getDataFromProperties(String Data) throws Exception{
		FileInputStream fis = new FileInputStream(iConstantUtility.propertiespath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String propertiesData = pobj.getProperty(Data);
		return propertiesData;
	}
}
