package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class P15 {

	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<String>();
		s1.add("A1");
		s1.add("A2");
		s1.add("sheela");
		s1.add("laila");
		s1.add("dinga");
		System.out.println(s1);
		System.out.println("=========================");
		for (String v : s1) {
			System.out.println(v);
		}

	}

}
