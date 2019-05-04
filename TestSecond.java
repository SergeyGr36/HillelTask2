package genericMethod;

import java.util.List;
//I hope that, i correctly understood this task. 
public class  TestSecond {
 public <T>void putArrayIntoCollection(T[] m, List<T> list ) {
	 for (int i = 0; i < m.length; i++) {
		list.add(m[i]);
	}
 }
}
