package zuoye;
//写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
public class Function_size {
	public static void main(String[] args) {
		String a = "hello";
		Function_size getSizer = new Function_size();
		int n = getSizer.getSize(a);
		System.out.println(n);
	}
	int getSize(String n){
		int s = n.length();
		return s;
	}

}
