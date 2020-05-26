package strategyPattern;

import java.util.Comparator;


/**
 * @author Dell
 *
 *类说明：
 *	实体类B的num属性比较器
 *
 */

public class NumofBComparator implements Comparator<B> {

	@Override
	public int compare(B b1, B b2) {
		// TODO Auto-generated method stub
		return b1.num-b2.num;
	}

}
