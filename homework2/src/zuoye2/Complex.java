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

//����/////////////
	public Complex() {

	}

	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

////�ӷ�/////////////
	public Complex add(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real + c2.real;
		c.im = c1.im + c2.im;
		return c;
	}

////����///////////////
	public Complex sub(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real - c2.real;
		c.im = c1.im - c2.im;
		return c;
	}

////�˷�/////////
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
 * ��������������**�����������£� ÿ����������ʵ�����鲿�����磬3 + 5i��3 Ϊʵ����5i Ϊ�鲿�����У�i ��Ϊ������λ�� �� i*i = -1��
 * �����������мӷ����㣬����ʱʵ����ʵ����ӣ��鲿���鲿��ӡ����磺 (1.5 �C 3i) + (2.3 + 2.4i) = (1.5+2.3) + (-3
 * + 2.4)i = 3.8 �C 0.6i �����������м������㣬��ӷ��������ơ� �����������г˷����㣬��������£� (a+bi) * (c + di)
 * = ac + adi + bci + bd(i*i) = (ac-bd) + (ad+bc)i ���磺 ��3+5i��*��4+6i��=
 * ��3*4-5*6��+��3*6+4*5��i = -18 + 38i дһ���� Complex��������ʾ�������������������������ԣ�double
 * real����ʾʵ���� double im����ʾ�鲿�� ��Ϊ Complex ������ add��sub��mul �������ֱ��ʾ�����ļӷ��������ͳ˷����㡣
 * ���У�add �������������£� public Complex add(Complex c) //��ʾ��ǰ Complex ��������� c �������
 * public Complex add(double real) //��ʾ��ǰ Complex ������ʵ�� real ���
 */