package com.example.mypackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

       // locations.put(0, new Location(0, "Front of comp", tempExit));

        Map<String, Integer> tempExit = new HashMap<String, Integer>();


    tempExit = tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "Front of comp", tempExit));
        //tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
//        tempExit.put("NORTH", 5);
//        tempExit.put("SOUTH", 4);
//        tempExit.put("EAST", 3);

//        tempExit.put("WEST", 2);
        //       tempExit.put("Q", 0);

        locations.put(1, new Location(1, "End of a road", tempExit));;


tempExit = tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
//        tempExit.put("NORTH", 5);

        locations.put(2, new Location(2, "Top of a hill", tempExit));;

        //       tempExit.put("Q", 0);
tempExit = tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
//        tempExit.put("WEST", 1);

        locations.put(3, new Location(3, "Inside a building", tempExit));;

        //      tempExit.put("Q", 0);
tempExit = tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
//        tempExit.put("NORTH", 1);
//        tempExit.put("WEST", 2);

        //       tempExit.put("W", 0);

        locations.put(4, new Location(4, "Valley", tempExit));;

        tempExit.put("S", 1);
        tempExit.put("W", 2);
//        tempExit.put("SOUTH", 1);
//
//        tempExit.put("WEST", 2);

//        tempExit.put("Q", 0);

        locations.put(5, new Location(5, "Forest", tempExit));;

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if(loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits");
            for(String exit: exits.keySet()){
                System.out.println(exit + ", ");
            }
            System.out.println();


            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word : words){
                    if(vocabulary.containsKey(word)){
                        direction= vocabulary.get(word);
                        break;
                    }
                }
            }

//            String[] direction2 = direction.split(" ");
//            for (String i : direction2){
//                if(i.equals("NORTH") || i.equals("SOUTH") || i.equals("WEST") || i.equals("EAST")){
//                    String direction3 = i.substring(0,1);
//                    loc = exits.get(direction3);
//                } else if  (exits.containsKey(direction2)){
//                    loc = exits.get(direction2);
//                } else {
//                    System.out.println("You cannot go in that direciton");
//                }
//            }
            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direciton");
            }

//
//            loc = scanner.nextInt();
//            if(!locations.containsKey(loc)){
//                System.out.println("You cannot go there");
        }
    }
}
