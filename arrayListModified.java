import java.util.*;
class GroceryList
{
	ArrayList<String> groceryList=new ArrayList<String>();


	//add Item method

	public void addItem()//Switch case 1
	{
		System.out.println("enter the item you want to enter");
		Scanner sc=new Scanner(System.in);
		groceryList.add(sc.nextLine());

	}


	//modify list

	public void modifyList(){ //switch case 2
		System.out.println("enter the position you want to modify");
		Scanner sc =new Scanner(System.in);
		int pos=sc.nextInt();
		System.out.println("Now enter the item you want to insert");
		Scanner sc1=new Scanner(System.in);
		String item=sc1.nextLine();
		groceryList.set(pos,item);
		System.out.println("Your item has been added");

	}
	
	//remove

	public void removeItem(){//switch case 3
		System.out.println("Enter the product you want to remove");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		groceryList.remove(x);
	}

	// public void showList(){
	// 	for (int i=0;i<groceryList.size();i++){
	// 		System.out.println(groceryList.get(i));
	// 	}
	// }







}





class arrayListModified
{
	public static void main(String[] args) {
		GroceryList list=new GroceryList();

		while (true){
		System.out.println("press 1 to add item to grocery list");
		System.out.println("press 2 to modify list");
		System.out.println("press 3 to remove item from the list");
		System.out.println("press 4 to show list");
		System.out.println("press 5 to exit");
		Scanner sc =new Scanner(System.in);
		int ch=sc.nextInt();
		


		switch(ch)
		{
			case 1:
			{
				list.addItem();
				break;

			}
			case 2:
			{
				list.modifyList();
				break;
			}
			case 3:
			{
				list.removeItem();
				break;

			}
			case 4:
			{
				for(int i=0;i<list.groceryList.size();i++)
				{
					System.out.println(list.groceryList.get(i));
				}
				break;
			}
			case 5:
			{
				System.exit(0);
			}
		}
	}
}
}