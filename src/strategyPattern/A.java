package strategyPattern;


/**
 * @author Dell
 *
 *类说明：
 *	实体类A，有2个属性：id和value用来测试排序
 *
 */

public class A {
	
	public A(int id, int value) {
		
		this.id = id;
		this.value = value; 
		
	}
	
	int id;
	
	int value;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A id: "+id+" value: "+value;
	}

	
}
