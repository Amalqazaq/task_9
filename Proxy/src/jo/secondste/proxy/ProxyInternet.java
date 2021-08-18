package jo.secondste.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
     private Internet internet=new UniversityInternet();
     private static List<String> allowedWebsites=new ArrayList<String>();
     
     static {
     allowedWebsites.add("Studentservice.com");
     allowedWebsites.add("Elearning.com");
     allowedWebsites.add("Univesrity.com");
     
     }
     
     
     @Override
	public void connect(String websiteHost) {
		// TODO Auto-generated method stub
    	 
    	 if(allowedWebsites.contains(websiteHost))
    	 {
    		 internet.connect(websiteHost);
    	 }
    	 else
    	 {
    		 System.out.println("you are not allowed to access the "+websiteHost +" website");
    	 }
    	 
		
	}

}
