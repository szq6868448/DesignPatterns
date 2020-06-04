package proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建被代理对象，业务主体需要此被代理对象来执行
		Movable car = new Car();
		
		//创建动态代理对象，由于返回的动态代理对象是Object类型，需要强制转换为被代理对象相同的接口；这里传入的代理处理器使用匿名内部类的形式实现
		Movable proxy = (Movable)Proxy.newProxyInstance(car.getClass().getClassLoader(),car.getClass().getInterfaces(), new InvocationHandler() {
			
			//由于此处使用的是匿名内部类，所以代理对象可以直接使用上面创建的car
			//如果不使用匿名内部类，可以在定义Invocation接口实现类时，在其内部持有一个代理对象的引用。通过构造函数引入
			
			/**
			 * private Movable mov;
			 * 
			 * public 实现类构造函数(Movable mov){
			 * 
			 * 		this.mov = mov;	
			 * 
			 * }
			 * 
			 */
			
			//当代理对象调用任何被代理对象的方法时，都会自动跳到这里的invoke方法，并把代理对象自身作为proxy参数，其调用方法作为method参数，调用方法时传入参数列表作为args参数
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				
				//定义返回值对象，这对象就是invoke方法的返回值，也是代理对象调用被代理对象方法返回值
				Object result = new Object();
				
				//如果代理对象调用了go方法，其实是car对象执行了go方法，不过会在执行前打印一些信息
				if("go".equals(method.getName())) {
					
					System.out.println("执行go方法");
					
					result = method.invoke(car, args);
				}else {
					
					//如果代理对象调用了stop或back方法，其实就是car对象去执行
					result = method.invoke(car, args);
					
				}
				
				//最终将结果返回给正在执行的方法
				return result;
				
			}
			
		});
		
		proxy.go();
		proxy.stop();
		proxy.back();

	}
	

}
