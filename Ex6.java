package Lab2;

public class Ex6 {
	public static int Sum(int[] t) {
		int current = t[0];
		int maxSum = t[0] ;
		int n=t.length;
		for(int i=1 ; i < n ; i ++) {
			current = Math.max(t[i], current + t[i]);
			maxSum = Math.max(maxSum, current);
		}
	    
	    return maxSum;
	}
	public static void main(String[] args ) {
		int []t = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Sum(t));
	}
}
