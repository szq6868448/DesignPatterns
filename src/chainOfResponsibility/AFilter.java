package chainOfResponsibility;

/**
 * 
 * 
 * @author Dell
 * 
 * 类说明：过滤器A用来检验Message的内容是否为空
 *
 */

public class AFilter implements Filter {

	@Override
	public boolean doFileter(Message msg) {
		
		System.out.println("过滤器A工作：校验msg的内容是否为空，如果内容为空则返回false，不需要其它过滤器再处理");
		
		if(null == msg.getContent()) {
			
			return false;
		}
		
		return true;
	}

}
