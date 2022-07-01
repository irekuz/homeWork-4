public class Main {
    public static void main(String[] args) {//#1
        int[] arr;
        arr = new int[]{3, 2, 5};
        float[] r;
        r = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(r[1]);
        int[] my;
        my = new int[3];
        my[0] = 90;
        my[1] = 85;
        my[2] = 80;
        for (int i = 0; i < 3; i++) {
            System.out.println(my[i]);
        }
        //zadanie #2

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int ii = 0; ii < r.length; ii++) {
            System.out.print(r[ii]);
            if (ii < r.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i3 = 0; i3 < my.length; i3++) {
            System.out.print(my[i3]);
            if (i3 < my.length) {
                System.out.print(", ");
            }
        }
        //Задание номер 3
        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(arr[i] + ", ");

            else
                System.out.print(arr[i]);
        }
        System.out.println();

        for (int i = r.length -1; i >= 0; i--) {
            if (i !=0)
                System.out.print(r[i] + ", ");

            else
                System.out.print(r[i]);
        }
        System.out.println();

        for (int i = my.length -1; i >= 0; i--) {
            if (i !=0)
                System.out.print(my[i] + ", ");
            else System.out.print(my[i]);
        }

        // Заданеие №4
        System.out.println();

        for (int i=0; i<arr.length; i++) {
            if(arr[i]%2==1) {
                arr[i]+=1;
            }
            if(i != arr.length -1)
                System.out.print(arr[i] + " ,");
            else
                System.out.print(arr[i]);
        }
    }
}