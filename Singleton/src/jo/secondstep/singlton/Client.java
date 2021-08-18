package jo.secondstep.singlton;

public class Client {
  public static void main(String[] args) 
  {
	  CurrentUser user = CurrentUser.getUser();
	  user.setEmail("amalqa@gmail.com");
	  user.setPassword("12345");
	  System.out.println(user.getEmail());
	  System.out.println(user.getPassword());
	  
	
  }
}
