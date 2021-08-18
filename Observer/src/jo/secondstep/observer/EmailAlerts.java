package jo.secondstep.observer;

import java.util.ArrayList;
import java.util.List;

public class EmailAlerts implements Notifier {
     List <Subscriber> subscribers=new ArrayList<Subscriber> ();
     public void addSubscriber(Subscriber subscriber) {
    	 subscribers.add(subscriber);
     }
     
     public void removeSubscriber(Subscriber subscriber) {
    	 subscribers.remove(subscriber);
     }
     
	@Override
	public void update() {
		for(Subscriber subscriber : subscribers) {
			System.out.println("send email to:" +subscriber.getEmail());
		}
	}

}
