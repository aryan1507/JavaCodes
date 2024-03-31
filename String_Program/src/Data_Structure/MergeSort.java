package Data_Structure;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {5,6,3,4,2,14,1,12,34,6,9};
		sort(arr);
		for(int n:arr) {
			System.out.print(n+" ");
		}
		

	}
   public static void sort(int[] arr) {
	   if(arr.length==1) return;
	   int[] left=new int[arr.length/2];
	   int[] right=new int[arr.length-left.length];
	   for(int i=0;i<left.length;i++) {
		   left[i]=arr[i];
	   }
	   for(int j=0;j<right.length;j++) {
		   right[j]=arr[left.length+j];
	   }
	   sort(left);
	   sort(right);
	   merge(left,right,arr);
   }

public static void merge(int[] a,int[] b,int[] c) {
	int i=0,j=0,k=0;
	while(i<a.length && j< b.length) {
		if(a[i]<b[j]) {
			c[k++]=a[i++];
		}
		else {
			c[k++]=b[j++];
		}
		
	}
	while(i<a.length) c[k++]=a[i++];
	while(j<b.length) c[k++]=b[j++];
}
}
