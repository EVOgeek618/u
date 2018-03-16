package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a[] = new int[]{6,-5,4,7,-2,12,-3,1,-8};
	float w=0;
	int f=0,g=0;
        Scanner sc = new Scanner(System.in);
        Integer Line =sc.nextInt();
	/*reverse(a);
	for (int i=0; i<a.length; i++) {
        w += a[i];
        System.out.print(a[i] + " ");
    }
        for (int i=0; i<a.length; i++) {
            if (a[i]>=0) f++;
             else g++;
            }
        System.out.println("\n"+w+" ");
        System.out.println(w/a.length+" ");
        System.out.println(f+" "+g);*/
	ArrayList<Integer> list = new ArrayList<>();
	    list.add(Line);
      for (Integer item: list) {
          System.out.print(item+" ");
      }
        for (Integer item: list) {
            w+=item;
        }
        for (Integer item: list) {
            if (item>=0) f++;
            else g++;
        }
        System.out.println("\n"+w+" ");
        System.out.println(w/list.size()+" ");
        System.out.println(f+" "+g);
        System.out.print("\n"+list);
    }
   public static void reverse(int arraw[]){
        for (int j =0; j<arraw.length/2;j++)
        {
            int s=arraw[j];
            arraw[j]=arraw[arraw.length -1-j];
            arraw[arraw.length -1-j]=s;
        }
    }
}
