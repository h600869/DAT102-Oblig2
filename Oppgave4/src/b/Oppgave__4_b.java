package b;

public class Oppgave__4_b {

	public static void main(String[] args) {
		int [] a = new int[10];
		
		a[0]=2;
		a[1]=5;
		
		System.out.println("a["+1+"] " + "= " + a[1]);
		for(int n = 2; n<10; n++)
		{
			a[n] = 5*a[n-1] - 6*a[n-2] + 2;
			
			System.out.println("a["+n+"] = "+a[n]);
		}
		
	}

}
