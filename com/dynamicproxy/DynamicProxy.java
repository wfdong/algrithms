package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{
	
	private Object object;
	
	public DynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("do something before1!");
		System.out.println("do something before2!");
		paramMethod.invoke(object, paramArrayOfObject);
		System.out.println("do something afterwoards1!");
		System.out.println("do something afterwoards2!");
		return null;
	}

}
