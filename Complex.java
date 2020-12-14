class Complex
{
	private double real = 1.0;
	private double imag = 2.0;
	public Complex()
	{
		real = imag=0.0;
	}
	public void add()
	{
		double sum =real+imag; 
		System.out.println("sum=" + sum);
	}
	public Complex(double real,double imag)
	{
		this.real = real;
		this.imag = imag;
	}
	public static void main(String[] args) 
	{
		Complex c = new Complex(1.5,2.5);
		c.add();
	}
}