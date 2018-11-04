package zuoye2;

public class Complex {
	private double real;
	private double im;

//////////////////
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

//构造/////////////
	public Complex() {

	}

	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

////加法/////////////
	public Complex add(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real + c2.real;
		c.im = c1.im + c2.im;
		return c;
	}

////减法///////////////
	public Complex sub(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real - c2.real;
		c.im = c1.im - c2.im;
		return c;
	}

////乘法/////////
	public Complex mul(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = (c1.real * c2.real) - (c1.im * c2.im);
		c.im = c1.real * c2.im + c1.im * c2.real;
		return c;
	}

	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(3, 4);
		Complex c = new Complex().add(c1, c2);
		System.out.println(c.real + "+" + c.im + "i");
	}
}
/*
 * （面向对象基础）**复数概念如下： 每个复数都有实部和虚部。例如，3 + 5i，3 为实部，5i 为虚部。其中，i 称为虚数单位， 有 i*i = -1。
 * 两个复数进行加法运算，运算时实部与实部相加，虚部与虚部相加。例如： (1.5 – 3i) + (2.3 + 2.4i) = (1.5+2.3) + (-3
 * + 2.4)i = 3.8 – 0.6i 两个复数进行减法运算，与加法运算类似。 两个复数进行乘法运算，其过程如下： (a+bi) * (c + di)
 * = ac + adi + bci + bd(i*i) = (ac-bd) + (ad+bc)i 例如： （3+5i）*（4+6i）=
 * （3*4-5*6）+（3*6+4*5）i = -18 + 38i 写一个类 Complex，用来表示复数。这个复数类具有两个属性：double
 * real，表示实部； double im，表示虚部。 并为 Complex 类增加 add、sub、mul 方法，分别表示复数的加法、减法和乘法运算。
 * 其中，add 方法的声明如下： public Complex add(Complex c) //表示当前 Complex 对象与参数 c 对象相加
 * public Complex add(double real) //表示当前 Complex 对象与实数 real 相加
 */