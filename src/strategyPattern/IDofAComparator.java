package strategyPattern;

import java.util.Comparator;


/**
 * @author Dell
 *
 *类说明：
 *	实体类A的id属性比较器
 *
 */

public class IDofAComparator implements Comparator<A> {

	@Override
	public int compare(A a1, A a2) {
		// TODO Auto-generated method stub
		return a1.id-a2.id;
	}

}
