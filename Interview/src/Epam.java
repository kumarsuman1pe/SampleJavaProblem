import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Epam {

	
	
	
//	output:
//	[epam, pame, aepm] contains same character
//	[java, ajav] contains same character
//	[abcd, dcba] contains same character
	
	public static void main(String[] args) {
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		
	Stream.of(arr).forEach(e->{
		Collections.sort(Arrays.asList(e.toCharArray()));
	});
	
	


	}

}




Class Employee{
	
	
	
	@ManyToMany
	(Jointable="" @joinColumn()
	Course course;
	
}





















