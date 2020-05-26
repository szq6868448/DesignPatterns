package strategyPattern;

import java.util.Comparator;

public class SelectionOrder  {
	

	//在排序方法中传入一个比较器，用来比较2个对象的大小
	public <T> T[] sort(T[] originalArray,Comparator<T> comparator) {
		
		
		
		for(int i=0;i<originalArray.length-1;i++) {
			
			int minPos = i;    //默认认为数组中的第一个值最小，minPos用来记录最小值的index
			
			for(int j=i+1;j<originalArray.length;j++) {
				
				if(comparator.compare(originalArray[minPos],originalArray[j])>0) {
					
					minPos=j;           //如果当前的最小值小于数组中的其他值，则更新minPos
				}
				
			}
			
			//System.out.println("找了第"+i+"个值，它的位置在" + minPos);
			
			T tem = originalArray[i];
			originalArray[i]=originalArray[minPos];
			originalArray[minPos]=tem;
			
			
		}
		
		System.out.println("排序完毕");
		
		return originalArray;
		
	}
	
	

}
