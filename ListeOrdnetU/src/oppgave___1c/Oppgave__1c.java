package oppgave___1c;

import java.util.*;
import no.hvl.dat102.adt.OrdnetListeADT;
import no.hvl.dat102.kjedet.KjedetOrdnetListe;
import no.hvl.dat102.listeklient.Person;

public class Oppgave__1c {

	public static void main(String[] args) {
		
		OrdnetListeADT<Person> listeMedPersoner = new KjedetOrdnetListe<>();
		
		Scanner scanner = new Scanner(System.in);
		String fornavn,etternavn,svar;
		int fodselsaar;
		
		
		for (int i =0; i<6; i++) {
		System.out.println("Skriv inn info om person: ");
		System.out.println("Fornavn: ");
		fornavn= scanner.nextLine();
		System.out.println("Etternavn: ");
		etternavn = scanner.nextLine();
		System.out.println("Fødselsår: ");
		fodselsaar = scanner.nextInt();
		scanner.nextLine();
		Person person = new Person(fornavn, etternavn, fodselsaar);
		listeMedPersoner.leggTil(person);
		
		
		
		
		System.out.println(fornavn+" "+etternavn+" "+fodselsaar + " år");
		}
		
		while (listeMedPersoner.antall()>0) 
		{
			Person person = listeMedPersoner.fjernSiste();
			System.out.println(person);
		}
		
		
	}

}
