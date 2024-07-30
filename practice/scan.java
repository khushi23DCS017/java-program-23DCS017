import java.util.Scanner;
class scan
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter a case:");
int case1=sc.nextInt();

switch (case1){
	case 1:
	Scanner s1=new Scanner(System.in);
	System.out.print("enter a number for factorial :");
    int x=s1.nextInt();
	int fact=1;
	
	for(int i=1;i<x;i++)
	{
		fact=fact*i;
	}
	System.out.print("factorial is:"+fact);
	break;
	case 2:
	System.out.print("enter a 10 numbers: ");
	int arr[]=new int[10];
	Scanner sc1= new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		arr[i]=sc1.nextInt();
	}
	
	for(int i=0;i<10;i++){
	
	if(arr[i]%2==0)
	{
		System.out.println(arr[i]+" is even");
	}
	else{
		System.out.println(arr[i]+" is odd");
	}
	}
	break;
	case 3:
	System.out.print("enter a 10 numbers: ");
	int arr2[]=new int[10];
	Scanner sc2= new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		arr2[i]=sc2.nextInt();
	}for(int i=0;i<10;i++){
	if(arr2[i]>0)
	{
		System.out.println(arr2[i]+" positive");
	}
	else{
		System.out.println(arr2[i]+" negative");
	}
	}
	break;
	
	case 4:
	System.out.print("enter a 10 numbers: ");
	int arr3[]=new int[10];
	Scanner sc3= new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		arr3[i]=sc3.nextInt();
	}
	boolean isprime=true;
	for(int i=2;i<arr3[i];i++){
		
	if(arr3[i]%2==0)
	{
		isprime=false;
	}
	if (isprime==true)
       {
         System.out.println(arr3[i]+" num is prime number..");
       }
       else{
         System.out.println(arr3[i]+" num is not prime number..");
       }
	break;
	}
	
}

}
}
