//Gayatri Prakash Patil Roll No. 41
//Print Pattern of Pascal Triangle
import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines required");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" "); //prints blankspaces
			}
			int num=1;
			for(k=0;k<=i;k++)
			{
				System.out.print(num+" "); //prints number
				num=num*(i-k)/(k+1); //formula
			}
			System.out.println(); //prints next line
		}
	}
}


/*
C:\Users\GAYATRI\Desktop\D7B 41 JAVA>javac Pattern.java

C:\Users\GAYATRI\Desktop\D7B 41 JAVA>java Pattern
Enter the number of lines required
6
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 1 5 10 10 5 1
 */