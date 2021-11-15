package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		double totalCredit = 0;
		double totalDebit = 0;
		Operation[] operations = new Operation[4];
		operations[0] = new Credit("08/11/2021", 16_000);
		operations[1] = new Debit("04/01/2019", 2_000);
		operations[2] = new Credit("18/10/2016", 25_000);
		operations[3] = new Debit("19/05/15", 3_000);
		
		for (int i = 0; i < operations.length; i++) {			
			System.out.println("Operation " +i + "   "+operations[i].getType() +"\tdate : "+operations[i].getDate() +"  montant : "+ operations[i].getMontant() );
		}
		
		for (int i = 0; i < operations.length; i++) {
			if(operations[i].getClass().equals(Credit.class)) {
				totalCredit += operations[i].getMontant();
			}
			if (operations[i].getClass().equals(Debit.class)) {
				totalDebit += operations[i].getMontant();
			}
		}
		
		System.out.println("Total Credit : -"+totalCredit);
		System.out.println("Total debit : "+totalDebit);
		

	}

}
