
// Working program with FastReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
public class CodeChef{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = s.nextInt();
        }
        int val = s.nextInt();
        while(t-->0){
        for(int i=9;i>=0;i--){
            if(arr[i]!=0&&arr[i]<=val&&val!=0){
                val = Math.abs(arr[i]-val);
                arr[i] = 0;
            }
            else{
                if(arr[i]!=0&&arr[i]>val&&val!=0){
                    arr[i] = Math.abs(val - arr[i]);
                    val = Math.abs(arr[i]-val);
                }
            }
        }
        for(int i=9;i>=0;i--){
            if(arr[i]!=0||i==0){
                System.out.println(i+1);
                break;
            }
        }
    }
    }
}