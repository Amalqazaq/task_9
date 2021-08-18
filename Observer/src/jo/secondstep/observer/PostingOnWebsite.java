package jo.secondstep.observer;

public class PostingOnWebsite implements Notifier{

	@Override
	public void update() {
		System.out.println("WE POST NEW VIDEO!!!");
		
	}

}
