package org.example;


public class App {
    public static void main(String[] args) {
        //Single line comment
        /*
         * multiline comment
         */
        /**
         * multiline comment
         */

        //example2();
        String[] names = {"Nisse", "Olle", "Erik", "Simon", "Sofia", "Selma", "Ulf", "Fredrik"};
        String find = "siMon";

       System.out.println("Found: " + findByName(find, names));
        System.out.println("Found: " + findByName("Olaf", names));

    }

    public static String findByName(String nameToFind, String[] arrayOfNames){

        for (String name : arrayOfNames){

            if (name.equalsIgnoreCase(nameToFind)){
                return name;
            }
        }
        return "Error: No match found";
    }


    public static void example2() {

        double[] doubles = new double[]{10.5, 11.9, 15.16, 19.65, 96, 15.5, 30, 45.63};

        doubles[5] = doubles[1];
        doubles[1] = 9001;

        for (int i = 0; i < doubles.length; i++) {

            // System.out.println("doubles[" + i + "] = " + doubles[i]);
            System.out.printf("doubles[%s] = %s%n", i, doubles[i]);
        }

        for (double value : doubles) {
            System.out.println("value = " + value);
        }


    }

    public static void example1() {
        /*
        [] = Syntax for creating an Array
         */

        //Creating arrays form primitive and objects.

        // index 0,1,2,3,4,5,6,7,8,9
        int[] integers = new int[10];

        System.out.println("integers.length = " + integers.length);

        //Default value
        System.out.println("integers[5] = " + integers[5]);

        //Setting a new value
        integers[5] = 19000;
        System.out.println("integers[5] = " + integers[5]);

        //Accessing the last element in the array.
        integers[integers.length - 1] = 15000;
        System.out.println("integers[9] = " + integers[9]);

        // Triggers a Exception
        System.out.println("integers[10] = " + integers[10]);


        String[] arrayOfStrings = {"Hey", "There", "!"};

    }


}
