/**
 * Created by Ali on 08/02/2021.
 */
public class Remove {
    public static void main(String[] args) {
        int x[]={10,12,13,16,19,20,271};

        int position = 3;
        int i;
        for (i=position+1; i<x.length;i++){
            x[i-1]=x[i];
        }
        i--;
        System.out.println(x[3]);
        System.out.println(i);
    }
}
