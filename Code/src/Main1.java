public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse("Hello");
	System.out.println(isPalindrone("ntitni"));
	System.out.println(isPalindrone("nitin"));
	System.out.println(isPlaidromeBetterVersion("ntitni",0,"ntitni".length()-1));
		
	}
	
	public static boolean isPlaidromeBetterVersion(String str,int start,int end)
	{
		if(start>=end)
		{ 
			return true;
			
		}
		
		return ((str.charAt(start)==str.charAt(end)) && isPlaidromeBetterVersion(str,start+1,end-1));
	}
	public static boolean isPalindrone(String str)
	{
		if(str==null)
		{
			return false;
		}
		
		if(str.length()<=1)
		{
			return true;
		}
		
		String firstChar=str.substring(0,1);
		String lastChar=str.substring(str.length()-1,str.length());
		if(!(firstChar.equals(lastChar)))
		{
			return false;
		}else
		{
			return isPalindrone(str.substring(1,str.length()-1));
		}
		
	
		
	}
	
	public static void reverse(String str)
	{
		StringBuilder str1=new StringBuilder();
		
		if(str==null || str.length()<=1)
		{
			 System.out.print(str);
			 str1.append(str);
			    
			 
		}
		else
        {
			str1.append(str.length()-1);
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }

	}

}
