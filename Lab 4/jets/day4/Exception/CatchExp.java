package jets.day4.Exception;

public class CatchExp {
    public void exceptionCatch() {
        try {
            ThrowExp throwExp = new ThrowExp();
            throwExp.exceptionThrow1();
        } catch (SteveException e) {
            System.out.println("All under control!");
        } finally {
            System.out.println("Now you can resume.");
        }

        try {
            ThrowExp throwExp = new ThrowExp();
            throwExp.exceptionThrow1();
        } catch (SteveException e) {
            System.out.println("Do not worry at all!");
        } finally {
            System.out.println("Now you can resume.");
        }

        try {
            ThrowExp throwExp = new ThrowExp();
            throwExp.exceptionThrow1();
        } catch (SteveException e) {
            System.out.println("Here we go again!");
        } finally {
            System.out.println("Now you can resume.");
        }
    }
}
