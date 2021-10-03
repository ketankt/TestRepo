import java.util.*;
public class Path {

	public static void main(String[] args)
	{

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int input2 = scan.nextInt();
        int []input3 = new int[n];
        for(int i=-0;i<n;i++){
            input3[i] = scan.nextInt();
        }
        int ans  = Sheena(n,input,input3);
        System.out.println(ans);
	}
}


