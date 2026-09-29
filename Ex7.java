package Lab2;

public class Ex7 {
	public static int maj(int[] t) {
	    int candidat = 0;
	    int compteur = 0;

	    for (int x : t) {

	        if (compteur == 0) {
	            candidat = x;
	            compteur = 1;
	        } else {
	            if (x == candidat) {
	                compteur++;
	            } else {
	                compteur--;
	            }
	        }
	    }

	    
	    int occ = 0; //occurence

	    for (int x : t) {
	        if (x == candidat) {
	            occ++;
	        }
	    }

	   
	    if (occ > t.length / 2) {
	        return candidat;
	    }

	    return -1;
	}
	public static void main(String[] args) {
		int[] t1 = {2, 2, 1, 2, 3, 2, 2};

		System.out.println(maj(t1));
	}
	
}
