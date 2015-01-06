package alfrescoDemo;



import java.util.HashMap;

import java.util.Stack;

public class CheckFormation {

	
	
	
			
	
	public boolean isFormed(String testString){
		
		HashMap<String,String> parenthesisValues =new HashMap<String,String>();
		
		parenthesisValues.put("}", "{");
		parenthesisValues.put("]", "[");
		parenthesisValues.put(")", "(");
	//	boolean weHaveStarted = false;
	
		Stack<String> checkValues = new Stack<String>();
	
		
		if ( testString == null ||testString.length() ==0 ) return false;   // the test string is null or empty so return here
		
		
		// iterate through the string looking for valid characters
		
		for (int i = 0; i< testString.length();i++){
		
			String stringChar = Character.toString(testString.charAt(i));
			
			if(parenthesisValues.containsValue(stringChar)){
		//		weHaveStarted = true;
				checkValues.push(stringChar);
		
				
			} else if(parenthesisValues.containsKey(stringChar)){ // closing parenthesis found in the string
				
				
				// the last value in the stack must be the value for the parenthesis key				
				String openingValue = parenthesisValues.get(stringChar);
				
				if (checkValues.isEmpty()) 
				{
					// no opening parenthesis so test fails
					return false;
				}
				
				
				if (checkValues.pop().equals(openingValue)){
					// remove the opening parenthesis from the stack
					
				} else {
					return false;  // opening and closing parenthesis do not match according to our map
				}
				}
		
			}	
				
			
				
				
	//	if (!weHaveStarted) return false;
			
		// our stack should be empty here otherwise we have an additional opening value e.g. [[[]]
		if (checkValues.isEmpty()){

	//		return weHaveStarted;
			return true;
			
		}else{
			return false;
		}
		
	}
			
	

	 		public static void main (String[] args){
	 			
	 			
	
	 	}
	
	
			
			
			
			
			
			
	
		
		
		
		
	}
	
	
	

