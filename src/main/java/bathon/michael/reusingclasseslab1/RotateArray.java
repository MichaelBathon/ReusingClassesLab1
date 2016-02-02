package bathon.michael.reusingclasseslab1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by michaelbathon on 2/2/16.
 */
public class RotateArray extends ArrayList {



    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();


    public void rotate(ArrayList list, int k){


        for(int i = 0; i < k; i++){
            list2.add(i, (Integer)list.get(i));

        }

        for(int j = 0; j < list.size()-k; j++){
            list.set(j, list.get(j+k));
        }

        for(int r = 0; r <k; r++){
            list.set(list.size()- (k-r), list2.get(r));
        }

    }







    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);


        RotateArray r1 = new RotateArray();

        System.out.println(list1);

        r1.rotate(list1, 5);

        System.out.println(list1);

        //list1.toString();

       //System.out.println(list1);



    }



}
