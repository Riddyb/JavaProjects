package org.example.arrays;

public class Array {
    public static void main(String[] args) {
        //We declared an array of numbers / and Array starts with 0
        int []fire={50,21,47,6,90,29,0,3,8,1};
        //For loop are mostly used to loop over an array
        //the int i =0 is trying to get the first index of the array
        //i<= fire.length is making sure that the actual size of the array is gotten
        //the i++ is you counting your arrays upward
        for (int i=0; i <= fire.length; i++ ){
            System.out.println(fire [i]);

        }

    }
}
