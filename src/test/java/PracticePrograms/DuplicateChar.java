package PracticePrograms;

public class DuplicateChar {

	public static void main(String[] args) {
		String str1="Aaanchalll";
		int count;
		char[] str=str1.toCharArray();
		for(int i=0;i<str.length;i++)
		{
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					count++;
					str[j]=0;
				}
			}
			if(count>1)
			{
				System.out.println(str[i]);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
