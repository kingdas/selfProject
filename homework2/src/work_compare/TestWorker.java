package work_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWorker {
	public static void main(String[] args) {
		List<Work_compare> set = new ArrayList<Work_compare>();
		set.add(new Work_compare("zhangsan", 18, 1500));
		set.add(new Work_compare("lisi", 18, 1500));
		set.add(new Work_compare("wangwu", 18, 1600));
		set.add(new Work_compare("zhaoliu", 17, 2000));
		Collections.sort(set);
		for (Work_compare w : set) {
			System.out.println(w);
		}
	}
}
