import java.util.Arrays;

public class Koko875 {
	boolean caneat(int mid,int[] piles,int h) {
		int eathours =0;
		for(int i=0; i<piles.length; i++) {
			eathours+=(piles[i]/mid);
			if(piles[i] % mid !=0) 
				eathours++;
		}
		if(eathours<=h)
			return true;
		return false;
	}
public int minikoko(int[] piles,int h) {
	int ans =0;
	int left =1, right =Arrays.stream(piles).max().getAsInt();
	System.out.println("sueed");
	while(left<right) {
		int mid =left + (left - right)/2;
		
		if(caneat(mid,piles,h)) {
			
		}
	}
return ans ;
}
}
