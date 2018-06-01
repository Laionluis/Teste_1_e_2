
public class Euclidean
{
	public static void main(String[] args)
	{
		int[] a;

		int n = 10;
		int m = 4;

		int resultado = solution(n, m);

		System.out.println("Chocolates eaten: " + resultado);
	}

	public static int solution(int n, int m)
	{
		int eat = 0;
		int aux[];
		int chocolates = 0;
		aux = new int[n];

		while( aux[eat] != 1)
		{
			aux[eat] = 1;
			eat = (eat + m) % n;
		}

		for(int i = 0; i < n ; i++)
		{
			if(aux[i] == 1) chocolates++;
		}	

		return chocolates;
	}

}