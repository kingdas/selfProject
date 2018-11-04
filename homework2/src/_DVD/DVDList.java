package _DVD;

import java.util.Date;

public class DVDList {
	private String name;
	private int state;
	private Date date;
	private int count;

	// 构造方法
	public DVDList(String name, int state, Date date) {
		this.name = name;
		this.state = state;
		this.date = date;
	}

	public DVDList() {

	}

	// get set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
