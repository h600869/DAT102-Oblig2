package oppgave_A;

public class Svar {

	public static void main(String[] args) {
		Parentessjekker stabel= new Parantessjekker__utfylling();
		
		String Alpha = "()nchc()";
		String Beta = "jsdu(()]";
		
		System.out.println("True hvis den er balansert, false hvis den ikke er balansert: ");
		
		System.out.println("\nAlpha: ");
		System.out.println(stabel.erBalansert(Alpha));
		
		System.out.println("\nBeta: ");
		System.out.println(stabel.erBalansert(Beta));
	}

}
