
public class Coins {

	public static void main(String[] args) {
		
		double payment = 20.00;
		double cost = 4.50;
		double change = (payment - cost);
		double numberoftens = (change/10.00);
		double numberoffives = ((change%10.00)/5);
		double numberof20ps = (((change%10.00)%5.00)/0.20);
		double numberof2ps = ((((change%10.00)%5.00)%0.20)/0.019);

		System.out.println((int) (numberoftens) + " �10 note");
		System.out.println((int) (numberoffives) + " �5 note");
		System.out.println((int) (numberof20ps) + " 20p");
		System.out.println((int) (numberof2ps) + " 2p");

	}

}
