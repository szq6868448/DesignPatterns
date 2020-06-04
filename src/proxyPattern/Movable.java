package proxyPattern;

/**
 * 
 * @author Dell
 *
 *接口说明：交通工具的通用接口
 */

public interface Movable {
	
	//交通工具前进的方法
	public void go();
	
	//交通工具停止的方法
	public void stop();
	
	//交通工具后退的方法
	public void back();
}
