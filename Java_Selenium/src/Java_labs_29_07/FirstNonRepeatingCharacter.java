package Java_labs_29_07;
import java.util.HashMap;

public class FirstNonRepeatingCharacter
{

	public static char firstNonRepeat(String s)
	{

		HashMap<Character, Integer> char_count = new HashMap<>();
		for(int i = 0; i <s.length(); i++) 
		{
			char c = s.charAt(i);
			if(char_count.containsKey(c))
			{
				char_count.put(c, char_count.get(c) + 1);
			} 
			else
			{
				char_count.put(c, 1);
			}
		}

		for(int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if(char_count.get(c)== 1)
				return c;
		}
		return '_';
	}

	public static void main(String[] args) 
	{
		System.out.println(firstNonRepeat("KatakOnKatak"));

	}
}
