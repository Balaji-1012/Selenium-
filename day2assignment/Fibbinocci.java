package week1.day2assignment;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNo = 0;
		int secondNo = 1;
		int sum = 0;
		System.out.println(firstNo + " ");
		System.out.println(secondNo + " ");
		
		for (int i =1; i<11; i++)
		{
			sum = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = sum;
			System.out.println(sum + "");
			
			
		}
		
		
		
	}

}
