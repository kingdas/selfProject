package practice_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_io {

	public static void main(String[] args) throws Exception {
//		File f = new File("d:/a.txt");
//		System.out.println(f.exists());
//		if (!f.exists()) {
//			f.createNewFile();
//		}
//		System.out.println(f.exists());

/////////////////////////////////////////////////

//		File fp = null;
//		File f = new File("d:\\a/b" + File.separator + "a.txt");
//		System.out.println(f.exists());
//		if (!f.exists()) {
//			fp = f.getParentFile();
//			if (!fp.exists()) {
//				fp.mkdirs();
//			}
//			f.createNewFile();
//		}
//		fp = f.getParentFile();
//		System.out.println(f.exists());
//		System.out.println(fp.getName());
//		System.out.println(fp.getAbsolutePath());
//		System.out.println(fp.isDirectory());
//		long t = f.lastModified();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
//		System.out.println(sdf.format(new Date(t)));

//////////////////////////////////////////////		/

//		String path = "d:/a";
//		File f = new File(path);
//		File[] fs = f.listFiles();
//		for (File ft : fs) {
//			if (ft.isDirectory()) {
//				System.out.println(ft.getName() + ":Folder");
//			} else {
//				System.out.println(ft.getName());
//			}
//		}

		////////////////////////////
//����������ȡ����
//
//		File f = new File("d:/a/b/a.txt");
//		InputStream is = new FileInputStream(f);
//		int t = is.read();
//		System.out.println((char) t);
//		is.close();
//����� ��д����
//
//		File f1 = new File("d:/a/b/a.txt");
//		OutputStream os = new FileOutputStream(f1);
//		os.write(97);
//		os.write(98);
//		os.write(99);
//		os.close();

		// ������ȡ
//		File f2 = new File("d:/a/b/a.txt");
//		InputStream is2 = new FileInputStream(f2);
//		int t;
//		while ((t = is2.read()) != -1) {
//			System.out.println((char) t);
//
//		}
//		is2.close();

///////////////////////////

		// ͼƬ���ܴ��롣������

/////////////////////////

		// �ֽ����顢���洫�����

//		File fs = new File("d:/a/aiqiyi.rar");
//		File fd = new File("d:/a/tecent.rar");
//		InputStream is = new FileInputStream(fs);
//		BufferedInputStream bis = new BufferedInputStream(is);
//		OutputStream os = new FileOutputStream(fd);
//		BufferedOutputStream bos = new BufferedOutputStream(os);
//		if (!fd.exists()) {
//			fd.createNewFile();
//		}
//		int len;
//		byte[] buff = new byte[1024];
//		long time = new Date().getTime();
//		while ((len = bis.read(buff)) != -1) {
//			bos.write(buff, 0, len);
//		}
//		System.out.println(new Date().getTime() - time);
//		bis.close();
//		bos.close();

		/////////////////////////////// sdfsad
		// װ���� ���ģʽ

//		��д�̶���������
		// д
//		File fd2 = new File("d:/a/b/z.txt");
//		OutputStream os2 = new FileOutputStream(fd2);
//		BufferedOutputStream bos2 = new BufferedOutputStream(os2);
//		DataOutputStream dos = new DataOutputStream(bos2);
//		dos.writeBoolean(false);
//		dos.writeDouble(3.14);
//		dos.writeChar('��');
//		dos.close();
//
//		// ��
//		File fs2 = new File("d:/a/b/z.txt");
//		InputStream is2 = new FileInputStream(fs2);
//		BufferedInputStream bis2 = new BufferedInputStream(is2);
//		DataInputStream dis = new DataInputStream(bis2);
//		boolean a = dis.readBoolean();
//		double b = dis.readDouble();
//		char c = dis.readChar();
//		System.out.println(a + " " + b + " " + c);
//		dis.close();

///////////////////////////////////////
		// �����д��Ͷ���
//��Userʵ��Serializable ��ʶ�ӿ� �������л� �ſɱ� ObjectOutStream/ObjectInputStream ����ʵ��д�롢����
//		User ud = new User("jins", 22);
//		File fd3 = new File("d:/a/b/o.txt");
//		OutputStream os3 = new FileOutputStream(fd3);
//		BufferedOutputStream bos3 = new BufferedOutputStream(os3);
//		ObjectOutputStream oos = new ObjectOutputStream(bos3);
//		oos.writeObject(ud);
//		oos.close();
//
//		File fs3 = new File("d:/a/b/o.txt");
//		InputStream is3 = new FileInputStream(fs3);
//		BufferedInputStream bis3 = new BufferedInputStream(is3);
//		ObjectInputStream ois3 = new ObjectInputStream(bis3);
//		User us = (User) ois3.readObject();
//		System.out.println(us);
//		ois3.close();

		///////////////////////////

		// �ַ���

//		File f = new File("d:/a/b/a.txt");
//		Reader r = new FileReader(f);
//		BufferedReader br = new BufferedReader(r);
//		String line = "";
//		while (((line) = br.readLine()) != null) {
//			System.out.println(line);
//		}
//		br.close();

		/////////////////////////

		// �ֽ���ת��Ϊ�ַ���

		File fs4 = new File("d:/a/b/a.txt");
		InputStream is4 = new FileInputStream(fs4);
		InputStreamReader isr = new InputStreamReader(is4);// �ؼ�����
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

		///////////////////////////

		// ���˶����ļ�(����Ϊ������".txt"��β���ļ�)

		File fd5 = new File("d:/a");
		File[] fa = fd5.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".txt");
			}
		});
		for (File ft : fa) {
			System.out.println(ft.getName());
		}
	}
}
