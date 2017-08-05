import java.math.BigInteger;


public class CountSetBits {

	public static void main(String[] args) {
		BigInteger a = new BigInteger("e4d5c550775afed2ecf8f519a112154d9586f8a073bc066a1ea629b64dca4438", 16);
		BigInteger b = new BigInteger("4ee604d732808dce3bcaebe8fcdccbff3083f583aec390f1ec25272445c017e0", 16);
		// xor two numbers
		BigInteger aXORb = a.xor(b);
		String s = aXORb.toString(2);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}

}
