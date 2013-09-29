
public class BitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int bitmask = 0x000F;
		int value = 0x2222;
		int value1 = 0x2220;
		int num1 = 0x0A5C;     /* hex. for 0000 1010 0101 1100 */
		int mask = 0x00F0; /* hex. for 0000 0000 1111 0000 */
		int num2 =num1 & bitmask; /* result=  0000 0000 0101 0000 */
		int k = 0x4B;
		
		System.out.println("value = " + value);
		System.out.println("bitmask = " + bitmask);
		System.out.println(k);
		System.out.println(k & bitmask);
		System.out.println(value ^ bitmask);
		System.out.println(value1 & bitmask);
		
		System.out.println(num2);


	}

}
