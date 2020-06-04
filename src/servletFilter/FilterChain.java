package servletFilter;

import java.util.ArrayList;

/**
 * 
 * 
 * @author Dell
 *
 *类说明：模拟过滤器链的类，内部有存放过滤器的容器，并提供方法调用全部过滤器执行过滤工作
 */


public class FilterChain {
	
	//保存全部过滤器的容器
	private ArrayList<Filter> list = new ArrayList<Filter>();
	
	//调用容器内过滤器的索引
	private static int index = 0; 
	
	//向容器中添加过滤器的方法
	public FilterChain add(Filter filter) {
		
		list.add(filter);
		
		return this;
		
		
	}
	
	//调用容器内过滤器处理请求和响应的方法，详细的执行逻辑后面会进行分析
	public void doFilter(Request req,Response res) {
		
		if(index == list.size()) {
			
			return;
		}else {
			
			Filter filter = list.get(index);
			
			index++;
					
			filter.doFileter(req,res,this);
			
			
		}
		
	}

}
