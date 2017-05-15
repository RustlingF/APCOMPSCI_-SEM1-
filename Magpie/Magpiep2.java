public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";

		/** Exercise_01:
		 * ==================================================
		 * 	Code that asks the user "Say something, please."
		 * 	if you enter nothing, or if you accidentally hit
		 * 	enter. Think to yourself: "What is the length of
		 * 	an empty String?" */
		 if (statement.length()==0)
		 {
			 response = "Say something,please.";
		 }

		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		else if (findKeyword(statement,"no")>=0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}	


		else
		{
		// Look for a two word (you <something> me)
		// pattern
		int psn = findKeyword(statement, "you", 0);


		if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
		{
			response = transformYouMeStatement(statement);
		}
		else
		{
			response = getRandomResponse();
		}
	}
	return response;
}
	private transformIWantToStatement(String statement)
	{
		statement = statement.trim(); 
		String lastChar = statement.substring(statement.length());
		if(lastChar.equals("."))
		{
			
		}
		int psn = findKeyword (statement, "I want to", 0);
		String restOfStatement = statement(psn + 9).trim();
		return "What would it mean to " + restOfStatement + "?";
		
	}

	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement
				.length() - 1);
		if (lastChar.equals("."))
		{
			statement = statement(0, statement
					.length() - 1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}
