package proxyPattern;

/**
 * 
 * @author Dell
 *
 *类说明：测试程序
 */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建被代理对象
		Movable car = new Car();
		
		//创建代理对象，并将被代理对象传入
		TimeProxy timeProxy = new TimeProxy(car);
		
		//此时执行go方法，执行的效果是car对象的go方法，并计算go方法的执行时间
		timeProxy.go();
		
		//代理的嵌套，将上一步的代理对象做为被代理对象传入
		LogProxy logProxy = new LogProxy(timeProxy);
		
		//此时执行go方法，效果是在执行car对象的go方法之前打印日志，并计算go方法的执行时间
		logProxy.go();

	}

}
