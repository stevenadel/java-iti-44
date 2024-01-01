class PrintArgument {
    public static void main(String args[]) {
        int input = 0;
        
        if (args.length == 0)
        {
            System.out.println("No arguments provided.");
            System.exit(1);
        }

        try {
            input = Integer.parseInt(args[0]);
            System.out.println(input);
        }
        catch (NumberFormatException e) {
            System.out.println("Provided argument is not an integer.");
        }
    }
}
