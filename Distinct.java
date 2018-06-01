
public class Distinct
{
	public static void main(String[] args)
	{
		int[] a;

		int n = 7;

		a = new int[n];

		a[0] = 0;
		a[1] = 1;
		a[2] = 1;
		a[3] = 3;
		a[4] = 2;
		a[5] = 0;

		int resultado = solution(a, n);

		System.out.println("There are " + resultado + " distinct values in array A");
	}

	public static int solution(int[] a, int n)
	{
		int distinct = 0; 
		int has;  
		int w = 0;
		int aux[];
		aux = new int[n];
		aux[w] = a[0]; 

		for(int i = 1; i < n; i++)
		{
			has = 0;
			for(int j = 0; j < n; j++)
			{
				if(a[i] == aux[j]) has = 1;
			}
			if( has == 0 )
			{
				w++;
				aux[w] = a[i];
			}
		}

		return w+1;
	}

}