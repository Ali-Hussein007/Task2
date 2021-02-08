import java.util.Arrays;

/**
 * Created by Ali on 08/02/2021.
 */
public class ArrayCopy {

    public static void main(String[] args) {

        int x[] ={10,11,14,15,16};
        int y []= new int[x.length];
        for (int i=0;i<x.length;i++){
            y[i]=x[i];
        }
        System.out.println(x[0]+" "+y[0]);
    }
    }
