package Data_Structure;

public class BubbleSort {

	public static void main(String[] args) {
	   int[] a= {1,2,1,6,3,7,8};
	   bSort(a);
	   for(int ar:a) {
		   System.out.print(ar+" ");
	   }

	}
     public static void bSort(int[] a) {
    	 for(int i=0;i<a.length-1;i++) {
    		 for(int j=0;j<a.length-1-i;j++) {
    		 if(a[j]>a[j+1]) {
    			 int temp=a[j];
    			 a[j]=a[j+1];
    			 a[j+1]=temp;
    		 }
    		}
    	 }
     }
}
