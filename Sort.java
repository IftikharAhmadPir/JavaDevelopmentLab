
public class Sort {
	
	int[] Ascending(int[] array)//function for ascending
	{
		int temp=0;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0 ;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					
				}
			}
		}
		return array;	
	}
	int[] Descending(int[] array)//function for descending
	{
		int temp=0;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0 ;j<array.length-1;j++)
			{
				if(array[j]<array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}	
		return array;
	}
	int FindSmallVal(int[] array)//function for finding smallest number
	{
		int min=array[0];
		for(int i=0; i<array.length -1;i++)
		{
			if (array[i+1]<array[i])
			{
				min=array[i+1];
			}
		}
	
		return min;
	}
	int FindBigestVal(int[] array)//function for finding biggest number
	{
		int max=array[0];
		for(int i=0 ;i<array.length - 1 ; i++)
		{
			if(array[i+1]>array[i])
			{
				max=array[i+1];
			}
			
		}
		return max;
	}
	int searchIndex(int[] arr,int num)
	{
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==num)
			{
				index=i;
			}
		}
		return index;
	}
}
