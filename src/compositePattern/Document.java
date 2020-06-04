package compositePattern;

/**
 * 
 * @author Dell
 *
 *类说明：文档类，整个文档结构的根节点
 */

public class Document extends BranchNode {
	
	public Document(String name) {
		
		super(name);
	}

	//空实现，因为文档本身是一个整体，没有具体内容，其具体内容都是由它的字节点（章节标题，章节内容）体现的
	public void p() {
		// TODO Auto-generated method stub
		
	}
	

}
