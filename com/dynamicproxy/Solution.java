package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Solution {

	public static void main(String[] args) {
		WfdTrip wfdTrip = new WfdTrip();
		//wfdTrip.goHome();
		
		/*WfdStaticProxy1 wfdStaticProxy1 = new WfdStaticProxy1(wfdTrip);
		wfdStaticProxy1.goHome();
		WfdStaticProxy2 wfdStaticProxy2 = new WfdStaticProxy2(wfdTrip);
		wfdStaticProxy2.goHome();*/
		
		InvocationHandler handler = new DynamicProxy(wfdTrip);
		Trip trip = (Trip)Proxy.newProxyInstance(handler.getClass().getClassLoader(), wfdTrip.getClass().getInterfaces(), handler);
		trip.goHome();
	}
}
