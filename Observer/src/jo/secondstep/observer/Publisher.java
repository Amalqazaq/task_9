package jo.secondstep.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
  private  List<Notifier> notifiers = new ArrayList<Notifier>();
 
   
  public void register(Notifier notifier) {
	  notifiers.add(notifier);
  }
  public void unregister(Notifier notifier) {
	  notifiers.remove(notifier);
  }
  public void inform() {
	  for (Notifier notifier:notifiers ) {
		  notifier.update();
	  }
  }
   
}
