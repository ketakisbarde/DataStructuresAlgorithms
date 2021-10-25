package com.dsa.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class array_example1 {

    public static void main(String[] args) {
	// define and use static arrays
        int[] array = new int[5];
        //int[] myIntArray = {1, 2, 3};
        //int num[][] = new int[5][2];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i]+ ",");
        }
        array_example1 ob = new array_example1();
        ob.arraylist();
    }

    public static void arraylist(){
        System.out.println("\nShowing array list example");
        List<String> food = new ArrayList<>();
        //For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

        //PUSH OPERATION
        //add() as push operation and cost is O(1)
        food.add("Pasta");
        food.add("Pizza");
        food.add("Daal fry and Rice");
        food.add("Paneer Curry");
        food.add("Paani puri chaat");
        food.add("Chicken biryani");
        System.out.println(food); //[Pasta, Pizza, Daal fry and Rice, Paneer Curry, Paani puri chaat, Chicken biryani]

        //ACCESS/LOOK-UP
        //get: access element using index O(1)
        System.out.println(food.get(1));

        //remove() -> pop(): Remove an item from the end of an array:  O(1)
        food.remove(food.size() - 1);
        System.out.println(food); //[Pasta, Pizza, Daal fry and Rice, Paneer Curry, Paani puri chaat]

        //add as insert : O(N)
        food.add(3, "Bats");
        System.out.println(food); //[Pasta, Pizza, Daal fry and Rice, Bats, Paneer Curry, Paani puri chaat]
        //set as insert
        food.set(2, "Tomato Soup");
        System.out.println(food);

        //remove() -- delete an element at a specific index: O(N)
        food.remove(3);
        System.out.println(food); //[Pasta, Pizza, Daal fry and Rice, Paneer Curry, Paani puri chaat]

        /**
         * To remove all the elements : food.clear(); [possibly O(n)]
         **/

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(70);
        nums.add(23);
        nums.add(40);
        nums.add(55);

        System.out.println(nums);
        nums.set(2,30);
        System.out.println(nums); //replaces 40 to 30 not insert
        nums.add(3,40);
        System.out.println(nums);

        Collections.sort(nums);  // Sort myNumbers
        System.out.println("After collections.sort(): " +nums);

        /*for (int i : nums) {
            System.out.println(i);
        }*/
    }
}
