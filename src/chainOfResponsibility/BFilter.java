package chainOfResponsibility;

/**
 * 
 * 
 * 
 * @author Dell
 * 
 * 类说明：过滤器B用来为Message内容添加注释
 *
 */

public class BFilter implements Filter {

	@Override
	public boolean doFileter(Message msg) {
		
		
		System.out.println("过滤器B工作:为msg的内容添加注释");
		
		String content = msg.getContent();
		
		msg.setContent(content+" //注释");
		
		return true;
	}

}
