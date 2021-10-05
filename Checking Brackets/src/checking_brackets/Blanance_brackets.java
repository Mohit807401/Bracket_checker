package checking_brackets;
import java.util.*;
public class Blanance_brackets
{
	public static void main (String args[])
	{
		String str;
		Stack<Character>st=new Stack<>();
		int index=0,a=0;
		char top;
		Boolean balance =true;
		str="foo(bar[i);";
		while(index<str.length())
		{
			if(st.empty()) a=index;
			if(str.charAt(index)=='['||str.charAt(index)=='{'||str.charAt(index)=='(')
			{
				st.push(str.charAt(index));
			}
			else 
			{
				if((str.charAt(index)==']'||str.charAt(index)=='}'||str.charAt(index)==')'))
				{
					if(st.empty()) 
					{
						balance =false;
						break;
					}
					else
					{
						top=st.peek();
						st.pop();
						if((top=='['&&str.charAt(index)!=']')||(top=='('&&str.charAt(index)!=')')||(top=='{'&&str.charAt(index)!='}'))
						{
							balance=false;
							break;
						}
					}
				}
			}
			index+=1;
		}
		if(balance&&st.empty()) System.out.println(" Success");
		else 
		{
			if((index>=str.length())&&!st.empty())
				System.out.println(a+1);
			else 
				System.out.println(index+1);
		}
	}

	
}
