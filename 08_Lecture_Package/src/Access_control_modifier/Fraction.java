package Access_control_modifier;

class Fraction {
	private int numerator; // ����
	private int denominator; // �и�
	
	Fraction(int numerator, int denominator) { 
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	double getDouble() { 
		return (double) numerator / denominator;
	}
	
	int getInt() { 
		return (int) getDouble();
	}
}
