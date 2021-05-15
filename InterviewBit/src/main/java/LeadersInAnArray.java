//Leaders In An Array
//Link : https://www.interviewbit.com/problems/leaders-in-an-array/

import java.util.ArrayList;

public class LeadersInAnArray {
    public int[] solve(int[] A) {
        int n = A.length;
        int j;

        ArrayList<Integer> solArr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (A[i] < A[j])
                    break;
            }

            if (j == A.length)
                solArr.add(A[i]);

        }
        int[] solution = new int[solArr.size()];
        for (int i = 0; i < solArr.size(); i++)
            solution[i] = solArr.get(i);
        return solution;
    }
}
