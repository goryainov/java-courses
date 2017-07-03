public class Calculate {

	public static void main(String[] args) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		short sum = (short) (first + second);
		double div = (double)first / second;
		float dec = (float) first - second;
		int mult = first * second;
		long power = (long) Math.pow(first, second);
		System.out.println("sum = " + sum);
		System.out.println("dec = " + dec);
		System.out.println("mult = " + mult);
		System.out.println("div = " + div);
		System.out.println("power = " + power);
	}
}