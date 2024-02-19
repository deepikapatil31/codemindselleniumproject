package deepika.mavenpackage;

public class multidimensionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][]= {{10,20,30,40,50},
				      {11,22,33,44,55},
				      {60,70,80,90,100},
				      {66,77,88,99,111},
				      {100,200,300,400,500}};
		System.out.println("Multi-Dimensional Array is :");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		       // this is used to get length of or number of rows
				System.out.println("rows= " + num.length);

				// this is used to get number of columns from specific index row
				System.out.println("1 rows columns = " + num[1].length);

				// changing value of index
				num[2][4] = 900;
				System.out.println("Multi-Dimensional Array after replacing value is :");
				for(int i=0;i<num.length;i++)
				{
					for(int j=0;j<num[i].length;j++)
					{
						System.out.print(num[i][j]+"\t");
					}
					System.out.println();
				}

				// accessing value by using index
				System.out.println("Display number by Accesng index: "+num[1][2]);
	}

}
