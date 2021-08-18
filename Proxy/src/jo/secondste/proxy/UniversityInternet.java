package jo.secondste.proxy;

public class UniversityInternet implements Internet {

	@Override
	public void connect(String websiteHost) {
		System.out.println("connect to :"+websiteHost);
		 
	}
	

}
