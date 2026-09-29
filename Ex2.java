package Lab2;

public class Pivots {
	
    public static void afficher(int[] t) {
    	int n = t.length;

        for (int i = 1; i <= n - 2; i++) {

            boolean pivot = true;

            
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    pivot = false;
                }
            }

            
            for (int k = i + 1; k < n; k++) {
                if (t[k] < t[i]) {
                    pivot = false;
                }
            }

            
            if (pivot) {
                System.out.print(t[i] + " ");
            }
        }
    }

    

    public static void main(String[] args) {
        int[] t = {2, 4, 3, 5, 6};
        afficher(t); 
        
        /*int[] t1 = {2, 4, 3, 5, 6};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {5, 4, 3, 2, 1};
        int[] t4 = {3, 3, 3, 3};
        int[] t5 = {7, 1, 5, 2, 6, 3, 4};
        afficher(t1);
        System.out.println();
        afficher(t2);
        System.out.println();
        afficher(t3);
        System.out.println();
        afficher(t4);
        System.out.println();
        afficher(t5);*/
    }
}
