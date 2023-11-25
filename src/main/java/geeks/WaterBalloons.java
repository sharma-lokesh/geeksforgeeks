package main.java.geeks;

public class WaterBalloons {
    public static void main(String[] args) {
        System.out.println(sequence("HELLO"));
    }
    static String sequence(String st){
        // code here
        if(st.length()==1)return st;
        String result="";
        char ch[] = st.toCharArray();
        result+=ch[0];
        result+=ch[2];
        for(int i=2; i<ch.length; i++){
            if(ch[i]==ch[i-1] && ch[i]==ch[i-2]){
                continue;
            }
            result+=ch[i];
        }
        return result;
    }
}
