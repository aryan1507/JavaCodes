package Data_Structure;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {3,4,1,2,12,6,1,7};
		sort(arr);
		for(int n:arr) {
			System.out.print(n+" ");
		}

	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
				
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}

}
