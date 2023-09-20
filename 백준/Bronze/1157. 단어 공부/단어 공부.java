import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        input=input.toUpperCase();
        int[] arr =new int[26];

        for(int i=0; i<input.length(); i++){
            int idx= input.charAt(i);
            arr[idx-65]++;
        }
        int max=0;
        int idx_num=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                idx_num=i;
            }
        }
        int chk=0;
        for(int i=0; i< arr.length; i++){
            if(max==arr[i]){
                chk++;
                if(chk>1){
                    System.out.println("?");
                    return;
                }
            }
        }
        System.out.println((char)(idx_num+65));
    }
}