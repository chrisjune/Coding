import java.util.Scanner;

public class MergeSort {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		int [] arr= new int [cases];
		for(int i=0;i<cases;i++){
			arr[i]=sc.nextInt();
		}
		//printarr(arr);
		merge_sort(arr);
		printarr(arr);
	}
	static void printarr(int []arr){
		//System.out.print("Array: ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//System.out.println();
	}
	static void merge_sort(int [] arr){
		int n=arr.length;
		if (n<=1)
			return;
		
		int [] arr1 = new int [n/2];
		int [] arr2 = new int [n-n/2];
		//int [] arr3 = new int [n];
		
		for(int i=0;i<n/2;i++){
			arr1[i]=arr[i];
		}
		for(int i=0;i<n-n/2;i++){
			arr2[i]=arr[i+n/2]; 
		}
		merge_sort(arr1);
		merge_sort(arr2);
		merge(arr1,arr2,arr);
		
	}
	
	static void merge(int [] arr1, int []arr2, int []arr3){
		int i1=0;
		int i2=0;
		int i3=0;
		
		
		for(int i=0;i1<arr1.length;i++){
		
			if(arr1[i1]<arr2[i2]){
				arr3[i3]=arr1[i1];
				i3++;
				i1++;
			}else{
				arr3[i3]=arr2[i2];
				i3++;
				i2++;
			}
			if(i2==arr2.length){
				for(int j=i1;j<arr1.length;j++){
					arr3[i3]=arr1[i1];
					i3++;
					i1++;
				}
			}
		}
		if(i2<arr2.length){
			for(int j=i2;j<arr2.length;j++){
				arr3[i3]=arr2[i2];
				i3++;
				i2++;
			}
		}
		
		
	}
	
}
