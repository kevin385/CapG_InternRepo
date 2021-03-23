package day14;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>(Arrays.asList("hi","Hello","asdfvx","bvbfghd","zasdfas","asdfsxcv"));
		System.out.println(strList.stream().filter(s->s.length()>5).count());
		strList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println();
		strList.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+" "));
		System.out.println();
		List<String> startWithA = strList.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		System.out.println(startWithA);
	}

}
