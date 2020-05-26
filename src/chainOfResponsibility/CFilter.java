package chainOfResponsibility;

/**
 * 
 * 
 * 
 * @author Dell
 * 
 * 类说明：过滤器C用来为Message内容添加批阅
 *
 */


public class CFilter implements Filter {

	@Override
	public boolean doFileter(Message msg) {
		
		System.out.println("过滤器C工作:为msg的内容添加批阅");
		
		String content = msg.getContent();
		
		msg.setContent(content+" //批阅");
		
		return true;
	}

}
