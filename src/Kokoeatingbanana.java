
public class Kokoeatingbanana {
public int minEatingSpeed(int[] piles, int h) {
	int i =1;
	int j =Integer.MAX_VALUE;
	while(i<j) {
		int k = i+(i-j)/2;
		int time =0;
		for(int x =0; x<piles.length; x++) {
			if(piles[x]<h)time++;
			else time+=(piles[x] +k-1)/k;
		}
		if(time>h)
			i=k+1;
		else j=k;
	}
        return i;
        
}

}
