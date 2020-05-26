package chainOfResponsibility;

/**
 * 
 * @author Dell
 *
 *类说明：此类用来模拟服务器对用户提交的Message进行操作并保存到数据库，或丢弃的过程
 */

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建过滤器链
		FilterChain chain = new FilterChain();
		
		chain.add(new AFilter()).add(new BFilter()).add(new CFilter());
		
		chain.invoke(new Message("用户提交的数据"));
		
		chain.invoke(new Message(null));

	}

}
