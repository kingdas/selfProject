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
	// 读取配置文件中的信息
	// MySql的安装bin目录路径和dump等参数  db_mes为数据库名
	static String sqlurl = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.5\\bin\\mysqldump -uroot	-proot -P3306 db_mes ";
	// 保存备份文件的路径及名称
	static String date;
	static String path = "E:/database";

	public OutSQl() {
		backup(); // 备份数据库
	}
	public static void backup() {
		try {
			Runtime rt = Runtime.getRuntime(); // 返回与当前的Java应用程序的运行时对象
			// 调用 调用mysql的安装目录的命令
			Process child = rt.exec(sqlurl);
			// 设置导出编码为utf-8。这里必须是utf-8
			// 把进程执行中的控制台输出信息写入.sql文件，即生成了备份文件。注：如果不对控制台信息进行读出，则会导致进程堵塞无法运行
			InputStream in = child.getInputStream();// 控制台的输出信息作为输入流
			InputStreamReader xx = new InputStreamReader(in, "utf-8");
			// 设置输出流编码为utf-8。这里必须是utf-8，否则从流中读入的是乱码
			String inStr;
			StringBuffer sb = new StringBuffer("");
			String outStr;
			// 组合控制台输出信息字符串
			BufferedReader br = new BufferedReader(xx);
			while ((inStr = br.readLine()) != null) {
				sb.append(inStr + "\r\n");
			}
			outStr = sb.toString();
			// 要用来做导入用的sql目标文件：
			Date d = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH");
			date = sdf.format(d);
			File fd = new File(path + "/" + date + ".sql");
			File fs = new File(path);
			if (!fd.exists()) {// 判断导出文件是否存在，如果不存在则创建它
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
