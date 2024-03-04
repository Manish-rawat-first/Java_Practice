import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class First{
    public static void main(String []args)throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(bf.readLine());
       System.out.print(a);

        
    }
}