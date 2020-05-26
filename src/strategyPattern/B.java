package strategyPattern;

/**
 * @author Dell
 *
 *类说明：
 *	实体类B，有2个属性：num和content用来测试排序
 *
 */


public class B {
	
	public B(int num,int content) {
		
		this.num=num;
		this.content = content;
		
	}
	
	int num;
	
	int content;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "B num: "+num+" content: "+content;
	}
	
	

}
