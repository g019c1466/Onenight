package com.example.onenight;

public class shuffle {
    public static void main(String[] args){
        int[] array1;
        array1 = new int[4];
        System.out.println("シャッフル前の配列要素");
        for(int i = 0; i < 4; i++){
            array1[i] = i + 1;
            System.out.print(array1[i] +" ");
        }
        System.out.println(" "); //改行



        System.out.println("シャッフルします");
        for(int i = 0; i < 8; i++){
            int x = new java.util.Random().nextInt(4);
            int y = new java.util.Random().nextInt(4);
            int z = array1[x];
            array1[x] = array1[y];
            array1[y] = z;
        }
        System.out.println("シャッフル後の配列要素");
        for(int i = 0; i < 4; i++){
            System.out.print(array1[i] + " ");
        }

    }

}

