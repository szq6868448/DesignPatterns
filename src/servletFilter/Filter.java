package servletFilter;


/**
 * 
 * 
 * @author Dell
 *
 *接口说明：模拟Servlet的过滤器接口，用来处理Request和Response
 */

public interface Filter {
	
	
	public void doFileter(Request req,Response res,FilterChain chain);

}
