import java.sql.Array;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Altimertic {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,8,9,3,4,5);
		
		list.stream().filter(e->e%2==0).map(e->e+5).count();
		
	}

}
