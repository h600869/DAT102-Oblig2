package oppgave_A;

import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.kjedet.*;

public class Parantessjekker__utfylling implements Parentessjekker {

	@Override
	public boolean erVenstreparentes(char p) {
		if (p == '(' || p == '[' || p == '{')
			return true;

		return false;
	}

	@Override
	public boolean erHogreparentes(char p) {
		if (p == ')' || p == ']' || p == '}')
			return true;
		
		return false;
	}

	@Override
	public boolean erParentes(char p) {
		if(erHogreparentes(p) || erVenstreparentes(p))
			return true;
		
		return false;
	}

	@Override
	public boolean erPar(char venstre, char hogre) {

		if ((venstre == '(' && hogre == ')' ) || (venstre == '[' && hogre == ']' ) || (venstre == '{' && hogre == '}'))
			return true;
		
		return false;
	}

	@Override
	public boolean erBalansert(String s) {
		
		StabelADT<Character> stabel = new KjedetStabel<Character>();
		for(int i =0; i<s.length(); i++) 
		{
			if (erParentes(s.charAt(i))) 
			{
				if(erVenstreparentes(s.charAt(i))) 
				{
					stabel.push(s.charAt(i));
				}
				
				if(erHogreparentes(s.charAt(i))) 
				{
					if(stabel.erTom()) 
					{
						return false;
					}
					if(!erPar(stabel.pop(),s.charAt(i))) 
					{
						return false;
					}
				}
			}
		}
		if(!stabel.erTom()) 
		{
			return false;
		}
		
		return true;
	}

}
