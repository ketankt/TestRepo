import java.util.*;
public class Meeting {
    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? (a[1] - b[1]) : (a[0] - b[0])));
        PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
        for (int[] i : intervals) {
            if (!queue1.isEmpty() && queue1.peek() <= i[0])
                queue1.poll();
            queue1.add(i[1]);
        }
        return queue1.size();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][2];
        for(int i =0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int answer = minMeetingRooms(arr);
        System.out.println(answer);
    }
}
