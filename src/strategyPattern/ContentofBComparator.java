package strategyPattern;

import java.util.Comparator;

/**
 * @author Dell
 *
 *类说明：
 *	实体类b的content属性比较器
 *
 */

public class ContentofBComparator implements Comparator<B> {

	@Override
	public int compare(B b1, B b2) {
		// TODO Auto-generated method stub
		return b1.content-b2.content;
	}

}
