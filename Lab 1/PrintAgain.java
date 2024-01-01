class PrintAgain {
    public static void main(String args[]) {
		if (args.length != 2) {
            System.out.println("Improper arguments provided.");
            System.exit(1);
        }  

        String inputStr = args[0];
        int inputInt = 0;

        try 
		{ 
            inputInt = Integer.parseInt(args[1]);
		}  
		catch (NumberFormatException e)  
		{ 
			System.out.println("Second argument is not a valid integer"); 
		} 

        for (int i = 0; i < inputInt; i++) {
            System.out.println(inputStr);
        }
    }
}
