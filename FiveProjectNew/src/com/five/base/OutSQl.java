package com.five.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OutSQl {
	// ��ȡ�����ļ��е���Ϣ
	// MySql�İ�װbinĿ¼·����dump�Ȳ���  db_mesΪ���ݿ���
	static String sqlurl = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin\\mysqldump -uroot	-proot -P3306 db_mes ";
	// ���汸���ļ���·��������
	static String date;
	static String path = "E:/database";

	public OutSQl() {
		backup(); // �������ݿ�
	}
	public static void backup() {
		try {
			Runtime rt = Runtime.getRuntime(); // �����뵱ǰ��JavaӦ�ó��������ʱ����
			// ���� ����mysql�İ�װĿ¼������
			Process child = rt.exec(sqlurl);
			// ���õ�������Ϊutf-8�����������utf-8
			// �ѽ���ִ���еĿ���̨�����Ϣд��.sql�ļ����������˱����ļ���ע��������Կ���̨��Ϣ���ж�������ᵼ�½��̶����޷�����
			InputStream in = child.getInputStream();// ����̨�������Ϣ��Ϊ������
			InputStreamReader xx = new InputStreamReader(in, "utf-8");
			// �������������Ϊutf-8�����������utf-8����������ж����������
			String inStr;
			StringBuffer sb = new StringBuffer("");
			String outStr;
			// ��Ͽ���̨�����Ϣ�ַ���
			BufferedReader br = new BufferedReader(xx);
			while ((inStr = br.readLine()) != null) {
				sb.append(inStr + "\r\n");
			}
			outStr = sb.toString();
			// Ҫ�����������õ�sqlĿ���ļ���
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
			date = sdf.format(d);
			File fd = new File(path + "/" + date + ".sql");
			File fs = new File(path);
			if (!fd.exists()) {// �жϵ����ļ��Ƿ���ڣ�����������򴴽���
				fs.mkdirs();
				fd.createNewFile();
			}
			FileOutputStream fout = new FileOutputStream(path + "/" + date
					+ ".sql");

			OutputStreamWriter writer = new OutputStreamWriter(fout, "utf-8");
			writer.write(outStr);
			writer.flush();
			in.close();
			xx.close();
			br.close();
			writer.close();
			fout.close();
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean judge() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
		date = sdf.format(d);
		File f = new File(path + "/" + date + ".sql");
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			if (in.read() != -1) {
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
