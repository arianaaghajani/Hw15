package ir.ariana.q1;

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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
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

    public Rational mul(Rational other){
        int newNumerator= this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator,newDenominator);
    }

    public Rational div(Rational other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator,newDenominator);
    }

    public double toFloatingPoint(){
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return "q1.Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
