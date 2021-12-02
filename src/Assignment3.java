import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the IP address : ");
        String ipAddress=scan.nextLine();
        System.out.println("Enter the count : ");
        int count=scan.nextInt();
        scan.nextLine();
        long median=ping(ipAddress,count);
        System.out.println("Median : "+median);
    }



    public static long ping(String ipAddress,int count) throws Exception {
        Socket socket;
        try {
                socket=new Socket(ipAddress,80);
        }catch (UnknownHostException e){
            System.out.println(e);
            return -1;
        }

        long[] timeArr=new long[count];
        while (count>0){
            long startTime=System.nanoTime();
            InetAddress address=null;
            address=socket.getInetAddress();
            if(address!=null){
                System.out.println("Connected to : "+address);
                long endTime=System.nanoTime();
                count--;
                timeArr[count]=endTime-startTime;
            }else {
                System.out.println("Error can't establish connection");
                break;
            }
        }
        Arrays.sort(timeArr);
        return timeArr[timeArr.length/2];
    }

}
