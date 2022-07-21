package src;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidationofEmail {
public static void main(String[] args) {
	ArrayList<String> emailID = new ArrayList<String>();
	 
	 emailID.add("jaswanth@gmail.com");
	 emailID.add("jas9977@gmail.com");
	 emailID.add("jaswanth999@gmail.com");
	 emailID.add("konduruu998@hotmail.com");
	 emailID.add("jaswanthkonduru@hotmail.com");
	 emailID.add("k.jaswanth@yahoo.com");
	 emailID.add("viratkohli@yahoo.com");
	 emailID.add("hitman@yahoo.com");
	 emailID.add("abc@yahoo.com");
	 
	 String searchElement;
	 System.out.println("Enter E-mail ID here: ");
	 Scanner email = new Scanner(System.in);
	 searchElement = email.nextLine();
	 String regex = "^(.+)@(.+)$";
	 Matcher matcher = Pattern.compile(regex).matcher(searchElement);
	 if (matcher.matches() && emailID.stream().anyMatch(mail -> 
	mail.equals(searchElement))) {
	 System.out.println(searchElement + " = E-mail ID found");
	 } else {
	 System.out.println("E-mail ID not found.Please recheck");
	 }
	 email.close();
	 }
	}
