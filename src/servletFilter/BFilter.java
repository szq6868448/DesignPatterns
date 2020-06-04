package servletFilter;

/**
 * 
 * 
 * 
 * @author Dell
 *
 *类说明：模拟Servlet过滤器，对传入的Request和Response进行处理
 */


public class BFilter implements Filter {

	@Override
	public void doFileter(Request req, Response res,FilterChain chain) {
		// TODO Auto-generated method stub
		
		req.setContent("过滤器B对请求内容："+req.getContent()+"进行修改");
		
		System.out.println(req.getContent());
		
		chain.doFilter(req, res);
		
		res.setContent("过滤器B对响应内容："+res.getContent()+"进行修改");
		
		System.out.println(res.getContent());
	}
	
	
}
