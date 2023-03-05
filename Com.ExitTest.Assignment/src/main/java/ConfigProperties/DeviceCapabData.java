package ConfigProperties;
import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;






public class DeviceCapabData {
	
	public static String getCapabilities(String inp) {
		String out = null;
		String projectPath=System.getProperty("user.dir");
		try {
		Properties prop=new Properties();
		InputStream input=new FileInputStream(projectPath+"\\src\\main\\java\\ConfigProperties\\DeviceCapabilityData.properties");
	    prop.load(input);
	    out=prop.getProperty(inp);
	    
		}
		catch(Exception exp){
		System.out.println(exp.getMessage());
		//System.out.println(exp.getCause());
		exp.printStackTrace();
		
		
	}
		return out;
	}


}
