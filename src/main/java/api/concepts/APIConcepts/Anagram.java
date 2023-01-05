package api.concepts.APIConcepts;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "aabb", s2 = "Care";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] s11 = s1.toCharArray();
		char[] s12 = s2.toCharArray();
		int len = s1.length();
		char temp=' ';
		for(int i=0; i<len; i++)
		{
			for(int index=0; index<len; index++)
			{
				if(index+1!=len)
				if(s11[index]>s11[index+1])
				{
					temp = s11[index];
					 s11[index] = s11[index+1];
					 s11[index+1] = temp;
				}
			}
		}
		for(char r: s11)
		{
			System.out.println(r);
		}
		
		for(int i=0; i<len; i++)
		{
			for(int index=0; index<len; index++)
			{
				if(index+1!=len)
				if(s12[index]>s12[index+1])
				{
					temp = s12[index];
					 s12[index] = s12[index+1];
					 s12[index+1] = temp;
				}
			}
		}
		for(char r: s12)
		{
			System.out.println(r);
		}
		
		if(Arrays.equals(s11, s12))
		{
			System.out.println("anagram");
		}
		else
			System.out.println("not a anagram");

	}

}
