package chainOfResponsibility;

import java.util.ArrayList;

/**
 * 
 * @author Dell
 * 
 * 类说明：过滤器链，内部持有一个Filter的List容器，容器中的每一个Filter都会对传入的Message进行处理
 *
 */


public class FilterChain {
	
	//装有Filter的容器类对象
	ArrayList<Filter> list = new ArrayList<Filter>();
	
	//向容器内添加过滤器对象，返回过滤器链自身（链式编码思想）
	public FilterChain add(Filter filter) {
		
		list.add(filter);
		
		return this;
		
	}
	
	//使用容器内过滤器依次对Message进行操作
	//如果其中任何一个过滤器的doFilter方法返回false则抛弃Message,其他过滤器不再处理此信息
	//如果全部过滤器的doFilter方法均返回true，则证明Message通过校验和系统修改，添加到数据库中
	public void invoke(Message msg) {
		
		for(Filter filter:list){
				
			if(!filter.doFileter(msg)) {
				
				System.out.println("内容异常，不保存此内容");
				
				return;
			}
		}	
		
		System.out.println("内容正常，保存到数据库中");
				

	}
}
