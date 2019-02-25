package dynamicproxy;

public class WfdStaticProxy2 implements Trip{

	private Trip trip;
	public WfdStaticProxy2(Trip trip) {
		this.trip = trip;
	}
	@Override
	public void goHome() {
		// TODO Auto-generated method stub
		System.out.println("do something before2!");
		
		trip.goHome();
		
		System.out.println("do something afterwards2!");
	}

}
