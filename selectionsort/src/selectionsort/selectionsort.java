package selectionsort;

public class selectionsort 
{
	public static void main(String[] args)
	{
		int a[]= {3,2,5,8,7,1};
		sort(a);
	}
	static void sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					int temp=a[j];
					a[j]=a[min];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
