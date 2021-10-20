package CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExpression {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	public static void main(String... args)
	{
		String str="asa das aasa dsa";
	//	Pattern pt=Pattern.compile(".s.");
		Pattern pt=Pattern.compile("\\s+");
		Matcher mt= pt.matcher(str);
		boolean b = mt.matches(); 
		if(b)
			System.out.println();
		while(mt.find())
		{
			System.out.println(mt.start());
		}
		System.out.println(mt.replaceAll("zzz"));
		
		
		String[] emailID={"ayush.sharma@gmail.com","A","aaaaa,com","aa@.com,","a@g.com","testmail@yahoo.com"};
		for(String id:emailID)
		{
		boolean result=validate(id);
		if(result)
			System.out.println(id);
		}	
	}
	public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);   //"^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"
        return matcher.find();
}
}
