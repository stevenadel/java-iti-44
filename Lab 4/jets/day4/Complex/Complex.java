package jets.day4.Complex;

public class Complex<T extends Number> {
    private final T real;
    private final T imaginary;

    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex<T> add(Complex<T> comp) {
        return new Complex<>(
                addNumbers(this.real, comp.real),
                addNumbers(this.imaginary, comp.imaginary)
        );
    }

    public Complex<T> subtract(Complex<T> comp) {
        return new Complex<>(
                subtractNumbers(this.real, comp.real),
                subtractNumbers(this.imaginary, comp.imaginary)
        );
    }

    public Complex<T> multiply(Complex<T> comp) {
        return new Complex<>(
                multiplyNumbers(this.real, comp.real),
                multiplyNumbers(this.imaginary, comp.imaginary)
        );
    }

    private T addNumbers(T a, T b) {
        return convertNumber(a.doubleValue() + b.doubleValue());
    }

    private T subtractNumbers(T a, T b) {
        return convertNumber(a.doubleValue() - b.doubleValue());
    }

    private T multiplyNumbers(T a, T b) {
        return convertNumber(a.doubleValue() * b.doubleValue());
    }

    private T convertNumber(double value) {
        if (real instanceof Integer) {
            return (T) Integer.valueOf((int) value);
        } else if (real instanceof Float) {
            return (T) Float.valueOf((float) value);
        } else if (real instanceof Double) {
            return (T) Double.valueOf(value);
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    @Override
    public String toString() {
        return (imaginary.doubleValue() > 0.0) ? (real + "+" + imaginary + "i") : (real + "" + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex<Integer> intComplex1 = new Complex<>(1, 2);
        Complex<Integer> intComplex2 = new Complex<>(3, 4);
        System.out.println("Integer Complex Addition: " + intComplex1.add(intComplex2));

        Complex<Float> floatComplex1 = new Complex<>(1.5f, 2.5f);
        Complex<Float> floatComplex2 = new Complex<>(3.5f, 4.5f);
        System.out.println("Float Complex Subtraction: " + floatComplex1.subtract(floatComplex2));

        Complex<Double> doubleComplex1 = new Complex<>(1.5, 2.5);
        Complex<Double> doubleComplex2 = new Complex<>(3.5, 4.5);
        System.out.println("Double Complex Multiplication: " + doubleComplex1.multiply(doubleComplex2));
    }
}
