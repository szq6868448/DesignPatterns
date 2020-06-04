package proxyPattern;

/**
 * 
 * @author Dell
 *
 *类说明：Movabel接口的实现类，汽车实体类
 */

public class Car implements Movable{

	@Override
	public void go() {
		
		// 汽车前进的业务代码，省略
		System.out.println("car go");
		
	}

	@Override
	public void stop() {
		
		// 汽车刹车的业务代码，省略
		System.out.println("car back");
		
	}

	@Override
	public void back() {
	
		// 汽车后退的业务代码，省略
		System.out.println("car go");
	}

}
