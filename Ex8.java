package Lab2;

public class Ex8 {

    public static void afficher(int[] t) {

        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        
        for (int i = 0; i < t.length; i++) {

            if (t[i] >= 1 && t[i] <= n) {
                vu[t[i]] = true;
            }
        }

        
        boolean trouve = false;

        for (int i = 1; i <= n; i++) {

            if (!vu[i]) {
                System.out.print(i + " ");
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun élément manquant");
        }
    }

   
    public static void main(String[] args) {

        
        int[] t1 = {1, 3, 3, 5};
        System.out.println("Test 1 : ");
        afficher(t1);
        System.out.print("\n");

        
        int[] t2 = {1, 2, 3, 4};
        System.out.println("Test 2 : ");
        afficher(t2);

        System.out.print("\n");
        
        int[] t3 = {3, 3, 3};
        System.out.println("Test 3 : ");
        afficher(t3);

        System.out.print("\n");
        int[] t4 = {1, 1, 1, 1};
        System.out.println("Test 4 : ");
        afficher(t4);

        System.out.print("\n");
    
        int[] t5 = {4, 2, 2, 1, 5};
        System.out.print("Test 5 : ");
        afficher(t5);


       
    }
}
