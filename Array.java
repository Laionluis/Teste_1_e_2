
public class Array
{
	public static void main(String[] args)
	{
		int[] a;

		int n = 7;

		a = new int[n];

		a[0] = 9;
		a[1] = 3;
		a[2] = 9;
		a[3] = 3;
		a[4] = 9;
		a[5] = 7;
		a[6] = 9;

		int resultado = solution(a, n);

		if (resultado != 0)	System.out.println("Unpaired element is: " + resultado);
		if (resultado == 0) System.out.println("There is no unpaired element!!");
	}

	public static int solution(int[] a, int n)
	{
		int unpaired = 0;   //if dont find any unpaired item return 0
		int max = a[0];     

		//for to find the big number in the array to use to "allocate" the other array
		for(int i = 0; i < n; i++)
		{
			if(a[i] > max) max = a[i];
		}
		int[] aux;
		aux = new int[max + 1];  

		//the index of aux is the element of a, and the element is the ocurrence
		for(int i = 0; i < n; i++) 
		{
			aux[a[i]]++;
		}

		//for to find the element that has only 1 ocorrence on the array aux, that is, the unpaired number
		for(int j = 0; j < max+1; j++)
		{
			if(aux[j] == 1) unpaired = j; 
		}

		return unpaired;
	}

}