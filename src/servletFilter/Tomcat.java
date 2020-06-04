package servletFilter;

/**
 * 
 * 
 * @author Dell
 *
 *类说明：用来模拟Tomcat调用FilterChain对请求和响应进行过滤处理的过程
 */

public class Tomcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//初始化过程，正常情况下是由Tomcat主程序加载配置文件创建过滤器和过滤器链，并将过滤器添加到过滤器链中
		FilterChain chain = new FilterChain();
		
		AFilter a = new AFilter();
		BFilter b = new BFilter();
		
		chain.add(a).add(b);
		
		//创建Request对象和Response对象
		//正常情况下，Tomcat会先将浏览器发送的请求内容封装到Request对象中，此时Request是有内容的，而请求数据现在应该是空的
		//经过过滤器链处理完请求数据后，交由Servlet填充响应内容，再交由过滤器链处理响应信息，最后返回给浏览器
		//考虑到这种情况太过复杂，这里再一开始就将响应数据一并封装，去掉了Servlet的处理过程
		Request req = new Request();
		Response res = new Response();
		
		req.setContent("请求信息");
		res.setContent("响应信息");
		
		//过滤器链处理请求与响应信息
		
		chain.doFilter(req, res);

	}

}
