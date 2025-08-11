package Java_all_days_program;

public class Sustringeg 
{

		public static void main(String[] args) {
			//Strings
			
			String s1="Hello World";
			
			System.out.println(s1);
			
			char[] ch= {'h','e','l','l','o'};
			String s2=new String(ch);
			System.out.println(s2);
			
			String s3=new String("Hello");
			System.out.println(s3);
			
			//String Methods
			
			//Equals
			
			String str1="Mumbai";
			String str2="Delhi";
			
			System.out.println(str1.equals(str2));//false
			System.out.println(str1.equalsIgnoreCase(str2));//false
			
			//Concatenation
			
			System.out.println(str1.concat(str2));//MumbaiDelhi
			
			//Contains
			
			System.out.println(str1.contains("Z"));//false
			
			//Substring
			
			System.out.println(str1.substring(3));
			System.out.println(str1.substring(1,3));
			
			//replace
			System.out.println(str1.replace("i","g"));
			System.out.println(str1.replaceAll(str1, "Pune"));
			
			//isEmpty
			
			System.out.println(str1.isEmpty());//false
			
			//ends With
			
			System.out.println(str1.endsWith("e"));//false
			
			//join
			String str3=String.join("-","city","Mumbai");
			System.out.println(str3);
			
			
			
			//Compare to lexo graphical comparison
			String text="java is a programming language";
			String[] result= text.split("");
			
			for(String str: result) {
				System.out.println(str+",");
			}
			
			
			
			

		}

	}

