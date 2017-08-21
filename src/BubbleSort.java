import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int temp;
		System.out.print("Enter the number of elements you want to sort:->");
		int a=sc.nextInt();
		int array[]=new int [a];
		System.out.println("Now it's time to enter the elements!");
		for (int i=0;i<a;i++){
			System.out.print("Enter the "+(i+1)+" element:->");
			array[i]= sc.nextInt();
		}
		for (int i=0;i<a;i++){
			for(int j=i;j<a-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		for (int i=0;i<a;i++){
			System.out.println(array[i]);
		}
		sc.close();
	}

}
