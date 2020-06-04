package compositePattern;

import java.util.ArrayList;

/**
 * 
 * 
 * @author Dell
 *
 *类说明：根节点和分支节点的抽象类，内部有保存子节点的容器
 */

public abstract class BranchNode implements Node {
	
	//用来保存子节点元素的
	ArrayList<Node> childNodes = new ArrayList<Node>(); 
	
	//节点名
	String name;
	
	public BranchNode(String name) {
		
		this.name = name;
		
	}
	
	//添加子节点到容器中
	public BranchNode add(Node childNode) {
		
		childNodes.add(childNode);
		
		return this;
	}
	
	public  ArrayList<Node> getChilds(){
		
		return childNodes;
		
	}

	//抽象类的实现类需要实现此业务方法
	public abstract void p();

}
