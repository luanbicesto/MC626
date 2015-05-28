package search;

public class BinarySearch implements ISearch {
	
	public int find(int[] a, int value)
	{
		int low = 0;
        int high = a.length - 1;
          
        while(high >= low) {
             int middle = (low + high) / 2;
             if(a[middle] == value) {
                 return middle;
             }
             if(a[middle] < value) {
                 low = middle + 1;
             }
             if(a[middle] > value) {
                 high = middle;
             }
        }
        
        return -1;
	}
}
