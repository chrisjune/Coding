
public class QuickSort {
	public static void main(String []args){
		int []arr={15,22,13,27,12,10,20,25};
		quickSort(arr,0,arr.length-1);
		printarr(arr);
	}
	
	static void printarr(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	static void quickSort(int []arr,int start, int end){

		if(start>=end){
			return;
		}
		int pv=start;
		int left=pv+1;
		int right=end;

		while(left<=right){
			if(arr[left]>arr[pv]&&arr[pv]>arr[right]){
				swap(arr, left,right);
				left++;
				right--;
			}
			else{
				if(arr[left]<arr[pv]){
					left++;
				}
				if(arr[pv]<arr[right]){
					right--;
				}
			}
		}
		if(arr[pv]>arr[right]){
			 swap(arr,pv,right);
		}
		quickSort(arr, start,right-1);
		if(right<left)
			quickSort(arr,right+1,end);
		else
			quickSort(arr,right,end);
		
	}
	
	static void swap(int [] arr,int left,int right){
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
	}
}
