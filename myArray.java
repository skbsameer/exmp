import java.util.Scanner;
class myArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		 n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
	/*	int array[]={10,20,-30};
		n=3; */
		System.out.println("My Array is:");
		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}
}