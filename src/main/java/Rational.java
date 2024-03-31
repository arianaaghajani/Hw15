public class Rational {
    int numerator;
    int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator==0){
            throw new IllegalArgumentException("denominator can not be zero");
        }
        this.denominator = denominator;
    }

    public Rational add(Rational other){
        int newNumerator =this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator= this.denominator * other.denominator;
        return new Rational(newNumerator,newDenominator);
    }

    public Rational sub(Rational other){
        int newNumerator= this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator= this.denominator * other.denominator;
        return new Rational(newNumerator,newDenominator);
    }

}
