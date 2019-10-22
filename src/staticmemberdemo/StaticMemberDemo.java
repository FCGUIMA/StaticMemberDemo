package staticmemberdemo;

public class StaticMemberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ItemSizes.ListAllSizes());
		
		Item item = new Item();
		item.setSize(ItemSizes.mSmall);
		System.out.println(item.size);	
		
		item.setSize(ItemSizes.mLarge);
		System.out.println(item.size);

	}

}
