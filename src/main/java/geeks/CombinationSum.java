package main.java.geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class CombinationSum {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(5);
        CombinationSum ob = new CombinationSum();

        res = ob.combinationSum(list, 16);
        if (res.size() == 0) {
            out.print("Empty");
        }
        // Print all combinations stored in res.
        for (int i = 0; i < res.size(); i++) {
            if (res.size() > 0) {
                out.print("(");
                List<Integer> ij = res.get(i);
                for (int j = 0; j < ij.size(); j++) {

                    out.print(ij.get(j));
                    if(j < ij.size()-1)
                        out.print(" ");
                }
                out.println(")");
            }
        }
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helperMethod(A,B,result,new ArrayList<>(), 0);
        return result;
    }
    public static void helperMethod(ArrayList<Integer> A, int B, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int root){
        if(B==0) result.add(new ArrayList<>(list));
        //to break the loop add one more value to list so that B is now negative and then remove last element by list.remove(list.size()-1);
        if(B<0) return;
        for(int i=root; i<A.size(); i++){
            if(i>root && A.get(i)==A.get(i-1)) continue;
            list.add(A.get(i));
            helperMethod(A,B-A.get(i),result,list,i);
            list.remove(list.size()-1);
        }
    }

}
