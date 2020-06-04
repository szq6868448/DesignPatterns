package compositePattern;

/**
 * 
 * @author Dell
 *
 *类说明：章节内容类
 */

public class ContentNode extends LeafNode {
	
	public ContentNode(String name) {
		
		super(name);
	}

	//此处的name属性相当于章节的内容
	public void p() {
		
		System.out.println(name);
		
	}

}
