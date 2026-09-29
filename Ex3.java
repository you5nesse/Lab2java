package Lab2;

public class Matrice {
	 public static int[][] Spirale(int n) {
		 int[][] m = new int[n][n];

		    int top = 0;
		    int bottom = n - 1;
		    int left = 0;
		    int right = n - 1;

		    int val = 1;

		    while (top <= bottom && left <= right) {

		        // 1) Haut : de gauche à droite
		        for (int j = left; j <= right; j++) {
		            m[top][j] = val;
		            val++;
		        }
		        top++;

		        // 2) Droite : de haut en bas
		        for (int i = top; i <= bottom; i++) {
		            m[i][right] = val;
		            val++;
		        }
		        right--;

		        // Vérifier si les bornes sont encore valides
		        if (top > bottom || left > right) {
		            break;
		        }

		        // 3) Bas : de droite à gauche
		        for (int j = right; j >= left; j--) {
		            m[bottom][j] = val;
		            val++;
		        }
		        bottom--;

		        // 4) Gauche : de bas en haut
		        for (int i = bottom; i >= top; i--) {
		            m[i][left] = val;
		            val++;
		        }
		        left++;
		    }

		    return m;
	        
	    }

	    
	    public static void afficherMatrice(int[][] m) {
	    	for (int i = 0; i < m.length; i++) {

	            for (int j = 0; j < m[i].length; j++) {
	                System.out.print(m[i][j] + "\t");
	            }

	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int n = 5; // à modifier pour tester
	        int[][] matrice = Spirale(n);
	        afficherMatrice(matrice);
	    }
}
