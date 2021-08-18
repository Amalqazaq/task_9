package jo.secondstep.observer;

public class Clients {
	
	
  public static void main(String[] args) {
	   Subscriber subscriber=new Subscriber();
	    subscriber.setEmail("amal@gmail.com");
	    EmailAlerts emailAlerts =new EmailAlerts();
	    emailAlerts.addSubscriber(subscriber);
	    PostingOnWebsite posWebsite=new PostingOnWebsite();
	    Publisher publisher=new Publisher();
	    publisher.register(posWebsite);
	    publisher.register(emailAlerts);
	    publisher.inform();
	    
  }
}
