class _Demo {
	public static void main(String[] args){
		if (args.length < 2){
			System.out.println("Please specify two strings to test");
			System.exit(0);
		}
		boolean result = false;
		System.out.println("The result of " + args[0] + " and " + args[1] +  " is: " + result);
	}
}
