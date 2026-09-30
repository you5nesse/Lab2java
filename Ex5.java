package Lab2;

public class Ex5 {
	public static boolean estPermutationCirculaire(int[] t) {

	    int n = t.length;

	    
	    boolean[] present = new boolean[n + 1];

	    for (int i = 0; i < n; i++) {

	        if (t[i] < 1 || t[i] > n) {
	            return false;
	        }

	        if (present[t[i]]) {
	            return false;
	        }

	        present[t[i]] = true;
	    }

	   
	    for (int debut = 0; debut < n; debut++) {

	        boolean identique = true;

	        for (int j = 0; j < n; j++) {

	            int valeur = (debut + j) % n + 1;

	            if (t[j] != valeur) {
	                identique = false;
	                break;
	            }
	        }

	        if (identique) {
	            return true;
	        }
	    }

	    return false;
	}
	public static void main(String[] args) {

	    int[] t1 = {3, 4, 5, 1, 2};
	    int[] t2 = {2, 4, 3, 1, 5};
	    int[] t3 = {4, 5, 1, 2, 3};

	    System.out.println(estPermutationCirculaire(t1));
	    System.out.println(estPermutationCirculaire(t2));
	    System.out.println(estPermutationCirculaire(t3));
	}
}
