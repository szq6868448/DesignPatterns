package proxyPattern;

/**
 * 
 * 
 * @author Dell
 *
 *
 *类说明：Movable接口的代理，可以在go和stop方法执行前打印日志
 */

public class LogProxy implements Movable {
	
	//代理对象持有被代理对象的引用
		Movable mov;
		
		//构造代理对象时传入一个Movable的实现类对象
		public LogProxy(Movable mov) {
			
			this.mov = mov;
			
		}

	@Override
	public void go() {
		
		System.out.println("执行go方法");
		
		mov.go();
		
	}

	@Override
	public void stop() {

		System.out.println("执行stop方法");
		
		mov.stop();
		
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

}
