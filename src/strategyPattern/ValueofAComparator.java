package strategyPattern;

import java.util.Comparator;

/**
 * @author Dell
 *
 *类说明：
 *	实体类B的value属性比较器
 *
 */

public class ValueofAComparator implements Comparator<A> {

	@Override
	public int compare(A a1, A a2) {
		// TODO Auto-generated method stub
		return a1.value-a2.value;
	}

}
