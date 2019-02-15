class palindrome
{
	public static void main(String[] args) {
		int x=131;
		    int firstDigit=x/100;
		int firstCut=x%100;
		     int secondDigit=firstCut/10;
		int secondCut=firstCut%10;
		int thirdDigit =secondCut;
		//     int secondDigit=firstQ%10;
		// int secondQ=firstQ/10;
		System.out.println(firstDigit);
		// System.out.println("firstcut"
		// 	+firstCut);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		int final1=((100*thirdDigit)+(10*secondDigit)+(firstDigit));
		System.out.println(final1);

		if(final1==x){
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrome");


	}
}