import java.util.*;

class minMaxIntrouble {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter array elements: ");
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        updated(A, N);
        System.out.println("Final array: ");
        for (int i=0; i<N; i++) {
            System.out.print(A[i]+" ");
        } 
        sc.close();        
    }
    
    public static int[] updated(int[] A, int N) {
        int i = 0;
        while (i < N) {
            Arrays.sort(A);
            int avg = 0;
            avg = (A[0]+A[N-1])/2;
            A[0] = A[0]+avg;
            A[N-1] = A[N-1] - avg;
            i++;
        }
        return A;
    }
}