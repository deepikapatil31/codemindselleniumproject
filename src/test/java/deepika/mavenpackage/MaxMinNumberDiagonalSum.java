package deepika.mavenpackage;
class calculation
{
	int a[]= {67,54,23,90,12,-4,1,3456};
	int max=a[0];
	int min=a[0];
	int b[][]= {{11,22,33},{44,55,66},{77,88,99}};
	void maxmin()
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
	
		}
		System.out.println("Max and Min Value in 1-D Array is: ");
		System.out.println("MAX VALUE IS : "+max);
		System.out.println("MIN VALUE IS : "+min);
	}
	void diagonal_sum()
	{
		System.out.println("**********Multi-Dimensional Array**********");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(b[i]==b[j])
				 sum=sum+b[i][j];
			}
		}
		System.out.println("******************************************************");
		System.out.println("The Sum of Diagonal element of 3*3 Array is : "+sum);
		System.out.println("******************************************************");


	}
	void maxminmulti()
	{
		int max=b[0][0];
		int min=b[0][0];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(b[i][j]>max)
				 max=b[i][j];
				if(b[i][j]<min)
					 min=b[i][j];
			}
		}
		
		System.out.println("Max and Min number in 3*3 matrix is: ");
		System.out.println("The Maximum number is: "+max);
		System.out.println("The Minimum number is: "+min);
		System.out.println("******************************************************");

	}
}
public class MaxMinNumberDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation c=new calculation();
		c.maxmin();
		c.diagonal_sum();
		c.maxminmulti();
	}

}
