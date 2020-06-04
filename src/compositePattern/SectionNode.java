package compositePattern;

/**
 * 
 * 
 * @author Dell
 *
 *
 *类说明：章节类
 */

public class SectionNode extends BranchNode {
	
	public SectionNode(String name) {
		
		super(name);
	}

	//name属性作为章节标题，此处模拟打印章节标题
	public void p() {
	
		System.out.println(name);
		
	}

}
