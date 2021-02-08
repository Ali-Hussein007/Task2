/**
 * Created by Ali on 08/02/2021.
 */
public class Random {


        public static void main(String[] args) {
            int a[] = new int[3];
            System.out.println("Before");
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            System.out.println("After");
            for (int i = 0; i <a.length ; i++) {
                int random= (int) Math.random();
                a[i]=random;
                System.out.println(a[i]);
            }

        }
    }

