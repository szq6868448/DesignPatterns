package compositePattern;

/**
 * 
 * @author Dell
 *
 *
 *类说明：文档读取器类，读取文档的内容
 */

public class DocumentReader {
	

	public static void main(String[] args) {
		
		//将全部节点安装树状结构组合起来
		
		Document doc = new Document("文档");
		
		SectionNode section1 = new SectionNode("1.");
		
		SectionNode section2 = new SectionNode("2.");
		
		SectionNode section11 = new SectionNode("1.1");
		
		SectionNode section21 = new SectionNode("2.1");
		
		SectionNode section22 = new SectionNode("2.2");
		
		ContentNode content11 = new ContentNode("章节1.1的内容");
		
		ContentNode content21 = new ContentNode("章节2.1的内容");
		
		ContentNode content22 = new ContentNode("章节2.2的内容");
				
		section1.add(section11.add(content11));
		section2.add(section21.add(content21)).add(section22.add(content22));
		
		doc.add(section1).add(section2);
		
		//遍历文档对象的全部节点
		readDocument(doc);

	}
	
	public static void readDocument(Document doc) {
	
		
		
		read(doc,0);
		
	}
	
	private  static void read(Node node, int depth) {
		
		for(int i=0;i<depth;i++) {
			
			System.out.print("--");
			
			
		}
		
		node.p();
	
		if(node instanceof BranchNode) {
		
			
			BranchNode branchNode = (BranchNode)node;
			
			for(Node childNode:branchNode.getChilds()) {
				

				read(childNode,depth+1);
			}
			
			
		}
	}
	
	

}
