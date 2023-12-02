import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class dupilcatearrayelement {
public ArrayList<Integer> dupic(int[] arr, int n){
	ArrayList<Integer> ar =new ArrayList<>();
for(int i=0; i<arr.length; i++) {
	for(int j=i+1; j<arr.length; j++) {
		if(arr[i] == arr[j] && !ar.contains(arr[i])) {
			ar.add(arr[i]);
			Collections.sort(ar);
		}
	}
}
if(ar.isEmpty()) {
	ar.add(-1);
}
	return ar;
}
}
