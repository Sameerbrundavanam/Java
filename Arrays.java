import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Arrays{
    public int arr[] = new int[5];
    Scanner read = new Scanner(System.in);
    public void takeInput(){
        for(int i=0;i<5;i++){
            int value = read.nextInt();
            arr[i] = value;
        }
    }
    public void show(){
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}


class TwoDArrays{
    InputStreamReader inp = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(inp);
    int arr[][] = new int[2][3];
    public void takeInput() throws IOException{
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                int value = Integer.parseInt(bf.readLine());
                arr[i][j] = value;
            }
        }
    }

    public void giveOutput(){
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
}


class JD{
    Scanner read = new Scanner(System.in);
    int arr[][] = new int[3][];
    public void initialiseArray(){
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
    }

    public void takeInput(){
        for(int sarr[]: arr){
            for(int i=0;i<sarr.length;i++){
                sarr[i] = read.nextInt();
            }
        }
    }

    public void giveOutput(){
        for(int sarr []:arr){
            for(int num:sarr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}