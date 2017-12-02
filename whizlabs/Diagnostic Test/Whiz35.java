import java.util.*;
import java.util.stream.Collectors;
public class Whiz35{
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(new Integer[]{3,4,5,6,7,8,9});
		HashMap<Integer,List<Integer>> map = list.parallelStream()
												 .collect(Collectors.groupingByConcurrent(i -> i% 2 == 0 ? 1 : 2));
		System.out.println(map.get(0));
	}
}

