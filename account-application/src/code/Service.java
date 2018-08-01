package code;

import java.util.HashMap;

public class Service {
	
	private HashMap<Integer, Object> accountHashMap = new HashMap<Integer, Object>();
	private static int accountID = 0;
		
	public int addAccount(String firstName, String lastName, long accountNumber) { //lagg till accountobjekt, lanka in i hashmapen
		Account newAccount = new Account (firstName, lastName, accountNumber);
		accountHashMap.put(accountID, newAccount);
		accountID++;
		return accountID--;
	}
	
	public boolean checkForAccount(int accountNumber) { 		
		if (accountHashMap.get(accountNumber) != null) { 
			return true;
		}
		else
			return false;		
	}
	
	public boolean removeAccount(int accountNumber) {
		if (checkForAccount(accountNumber)) {
			accountHashMap.remove(accountNumber);
			return true;
		}
		else
			return false;
	}
	
}
