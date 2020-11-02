package SeleniumPractice;

import java.util.ArrayList;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class StreamFilter {
	//@Test
	public void Steamtest()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Akash");
		names.add("star");
		names.add("AB");
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
				
			}
			
			System.out.println(count);
		}
	}
		@Test()
		public void Steamtest1()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Akash");
			names.add("star");
			names.add("AB");
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
		
	}

}
