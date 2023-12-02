import java.util.ArrayList;

public class firstandlast {
public ArrayList<Integer> find (int arr[] , int l, int x){
	ArrayList<Integer> ar =new ArrayList<>();
	int firstindex =-1;
	int lastindex =-1;
	for(int i =0 ; i<l ; i++) {
			if(arr[i] == x) {
				if(firstindex == -1) {
					firstindex = i;
				}
				lastindex =i;
			}
		}
	ar.add(firstindex);
	ar.add(lastindex);
	
	return ar;
}
}
