package code;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {
	
	public Service() {
		addAccount("Name1", "Namesson1", 12345612345611L);
		addAccount("Name2", "Namesson2", 12345612345612L);
		addAccount("Name3", "Namesson3", 12345612345613L);
	}
	
	private HashMap<Integer, Object> accountHashMap = new HashMap<Integer, Object>();
	private static int accountID = 0;
		
	public int addAccount(String firstName, String lastName, long accountNumber) { 
		accountHashMap.put(accountID, new Account (firstName, lastName, accountNumber));
		accountID++;		
		return accountID;
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
	
	public String getJSON() {
		JSONObject json = new JSONObject(accountHashMap);			
		String jsonPrint = json.toString();
		return jsonPrint;

	}
	
}
