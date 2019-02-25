package dynamicproxy;

public class WfdStaticProxy1 implements Trip{

	private Trip trip;
	public WfdStaticProxy1(Trip trip) {
		this.trip = trip;
	}
	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("do something before1!");
		
		trip.goHome();
		
		System.out.println("do something afterwards1!");
	}

}
