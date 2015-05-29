package search;

public class HeapSort implements ISort {
	private int N;
	
	public int[] sort(int[] a)
	{
		heapify(a);        
        for (int i = N; i > 0; i--)
        {
            swap(a,0, i);
            N = N-1;
            maxheap(a, 0);
        }
        
        return a;
	}
	
	private void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
	
	private void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    } 
	
	private void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }  
}