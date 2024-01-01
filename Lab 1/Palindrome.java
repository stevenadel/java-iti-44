class Palindrome {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Must provide one argument.");
            System.exit(1);
        }
        String str = args[0];
        int first = 0;
        int last = str.length() - 1;

        while (last > first) {
            Character start = str.charAt(first);
            Character end = str.charAt(last);

            if (!start.equals(end)) {
                System.out.println("Not a palindrome.");
                System.exit(0);
            }
            first++;
            last--;
        }
        
        System.out.println(str + " is a palindorme.");
    }
}
