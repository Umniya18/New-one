//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String,Integer>();
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		Scanner chop = new Scanner(sent);
		
		while (chop.hasNext())
		{
			String letter = chop.next();
			if (histogram.containsKey(letter))
			{
				histogram.put(letter, histogram.get(letter) + 1);
			}
			else
			{
				histogram.put(letter, 1);
			}
		}
		chop.close();
	}

	public String toString()
	{
		String output = "char\t123456789012345\n";
		
		for (String key : histogram.keySet())
		{
			String allStars = "";
			int count = histogram.get(key);
			
			for (int i = 0; i < count; i++)
			{
				allStars += "*";
			}
			
			output += key + "\t" + allStars + "\n";
		}
		
		return output + "\n";
	}
}
