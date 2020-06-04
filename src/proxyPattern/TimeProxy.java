package proxyPattern;

/**
 * 
 * 
 * @author Dell
 *
 *
 *类说明：Movable接口的代理，可以计算Movable的每一个方法的执行时间
 */

//之所以代理对象也要实现统一接口，是为了代理的嵌套
public class TimeProxy implements Movable{

	//代理对象持有被代理对象的引用
	Movable mov;
	
	//构造代理对象时传入一个Movable的实现类对象
	public TimeProxy(Movable mov) {
		
		this.mov = mov;
		
	}
	
	
	//这里不用自行实现Movable的方法，而是直接调用传入的Movable对象的方法,再对这些方法进行一些修改
	public void go() {
		
		long startTime = System.currentTimeMillis();

		mov.go();   

		long endTime = System.currentTimeMillis();
		
		long spendTime = endTime-startTime;

		System.out.println("go方法的执行时间是"+ spendTime );
		
		
	}

	@Override
	public void stop() {


		long startTime = System.currentTimeMillis();

		mov.stop();   

		long endTime = System.currentTimeMillis();
		
		long spendTime = endTime-startTime;

		System.out.println("stop方法的执行时间是"+ spendTime );
		
	}

	@Override
	public void back() {
		
		long startTime = System.currentTimeMillis();

		mov.back();   

		long endTime = System.currentTimeMillis();
		
		long spendTime = endTime-startTime;

		System.out.println("back方法的执行时间是"+ spendTime );
		
	}

}
