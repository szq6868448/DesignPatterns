package compositePattern;

/**
 * 
 * 
 * @author Dell
 *
 *类说明：叶子节点的抽象类，不能保存子节点
 */

public abstract class LeafNode implements Node {

	//节点名
	String name;
		
	public LeafNode(String name) {
			
		this.name = name;
			
	}
	
	//抽象类的实现类需要实现此业务方法
	public abstract void p();
	
}
