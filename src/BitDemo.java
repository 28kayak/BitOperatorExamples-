
public class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int bitmask = 0x000F;
		int value = 0x2222;
		int value1 = 0x2220;
		
		System.out.println("value = " + value);
		System.out.println("bitmask = " + bitmask);
		System.out.println(value & bitmask);
		System.out.println(value ^ bitmask);
		System.out.println(value1 & bitmask);

	}

}
