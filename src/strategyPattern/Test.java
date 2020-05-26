package strategyPattern;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IDofAComparator idComparator = new IDofAComparator();
		ValueofAComparator valueofAComparator = new ValueofAComparator();
		
		
		NumofBComparator numofBComparator = new NumofBComparator();
		ContentofBComparator contentComparator = new ContentofBComparator();
		
		A a1 = new A(1,2);
		A a2 = new A(2,3);
		A a3 = new A(3,1);	
		
		A[] arraryA = {a1,a2,a3};
		
		B b1 = new B(4,3);
		B b2 = new B(4,1);
		B b3 = new B(3,2);
		
		B[] arraryB = {b1,b2,b3};
		
		
		SelectionOrder order = new SelectionOrder();
		
		System.out.println(Arrays.toString(order.sort(arraryA, idComparator)));
		System.out.println(Arrays.toString(order.sort(arraryA, valueofAComparator)));
		
		System.out.println(Arrays.toString(order.sort(arraryB, numofBComparator)));
		System.out.println(Arrays.toString(order.sort(arraryB, contentComparator)));
		
		

	}

}
