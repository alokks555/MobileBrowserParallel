package testInitDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import com.mobileauto.config.LoadPropertiesData;
import com.mobileauto.config.StorePropertiesData;

public class InitiateScript {

	
	public static void main(String[] args) throws IOException {

		Properties prop = new LoadPropertiesData().loadPropertiesFile(new File("").getCanonicalPath()+"/data/Android.properties");
		HashMap<String,String> classDataMap = new StorePropertiesData().storePropIntoHashMap(prop);
		
		for (Entry<String, String> entry : classDataMap.entrySet()) {
			System.out.println(entry);
		}
	}
}
