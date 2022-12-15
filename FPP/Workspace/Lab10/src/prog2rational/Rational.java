package prog2rational;

import java.util.Objects;

public class Rational {

	private int num;
	private int den;

	public Rational(int p, int q) {
		this.num = p;
		this.den = q;

		if (q < 0) {
			throw new IllegalArgumentException("The number is not positive");
		}
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setDen(int den) {
		this.den = den;
	}

	// adds the rational rat to this Rational
	public Rational add(Rational rat) {
		Rational add = new Rational(num, den);
		add.num = this.num * rat.den + this.den * rat.num;
		add.den = this.den * rat.den;
		return add;

	}

	// multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		Rational mul = new Rational(num, den);
		mul.num = this.num * rat.num;
		mul.den = this.den * rat.den;
		return mul;
	}

	// returns –1 if this rational is less than rat
	// returns 0 if this rational equals (see equals
	// method discussion below) rat
	// returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
    	if(num * rat.den < den * rat.num) {
    		return -1;
    	}
    	else if(num * rat.den > den * rat.num) {
    		return 1;
    	}
    	else {
    		return 0;
    	}
    }

	@Override
	public int hashCode() {
		return Objects.hash((double)num/(double)den);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		return Objects.equals(den, other.den) && Objects.equals(num, other.num);
	}

	@Override
	public String toString() {
		return String.format("%d/%d", num, den);
	}

	public static void main(String[] args) {
		
		Rational r1 = new Rational(2, 3);
		Rational r2 = new Rational(-17, 5);
		Rational r3 = new Rational(1, 3);
		
		System.out.print("(" + r1 + " * " + r2 + ")" + " + " + r3);
		
		Rational  result1 = r1.multiply(r2).add(r3);
		Rational  result2 = r1.multiply(r2.add(r3));
		
		if(result1.compareTo(result2) > 0) {
			System.out.printf("%s", " is greater than ");
		}
		else {
			System.out.printf("%s", " less than ");
		}		
		System.out.println( r1 + " * (" + r2 + " + " + r3 + ")");

	}
}
