package deepika.mavenpackage;

public class ArrayAscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {78,4,56,23,12,87,90,564,34};
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array in Ascending Order:");
		for(int a:num)
		{
			System.out.println(a);
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Array in Descending Order:");
		for(int a:num)
		{
			System.out.println(a);
		}
	}

}
