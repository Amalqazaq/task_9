package jo.secondste.proxy;

public class Client {
	
  public static void main(String[] args) 
  {
	
     Internet internet=new ProxyInternet();
     internet.connect("Studentservice.com");
     internet.connect("Facebook.com");
  }
}
