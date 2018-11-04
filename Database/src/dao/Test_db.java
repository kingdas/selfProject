package dao;

public class Test_db {
	public static void main(String[] args) throws Exception {
		UserDao ud = new DaoImplement();
		User u = new User("john", 2);
//		System.out.println(ud.add(u));
//		System.out.println(ud.delete(4));
		User u1 = new User(5,"mike",1);
		System.out.println(ud.update(u1));
	}
}
