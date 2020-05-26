package chainOfResponsibility;

/**
 * 
 * 
 * @author Dell
 *
 *接口说明：Message类的过滤器接口
 */

public interface Filter {
	
	//doFilter方法是过滤器的业务方法，需要对传入的内容进行业务上的修改，检查等操作
	//返回一个boolean类型的值，用来标记是否需要过滤器链上的下一个过滤器对Message进行操作
	
	public boolean doFileter(Message msg);

}
