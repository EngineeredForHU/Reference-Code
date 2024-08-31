public class Practice {

    public static void main(String[] args) {

        //                                  1.  Array int

        //Creates and initializes an Array with int {3,9,23,...}
        int[] ages = {100, 9, 23, 64, 2, 8, 28, 93};
        System.out.println("subtract the first index from the last from ages: "+ subtract(ages));

        //Creates and initializes an Array with int {23,45,23,...}
        int[] ages2 = {60, 45, 23, 45, 78, 54, 90, 34, 56};
        System.out.println("subtract the first index from the last from ages2:  "+subtract(ages2));

        //prints the avg of ages
        System.out.println("the avg age is: "+avg(ages));


        //-----------------------------------------------------------------------------------------------------------------
        // 2.  String Array

        //Array of Strings: names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // placeholder sum for the total amount of letters in the names
        int sum = 0;
        //placeholder for the AVG
        double avg = 0;

        //enhanced for loop that gets the length of each word
        for (String name : names) {
            sum += name.length();
            avg = sum / names.length;

        }
        System.out.println("avg name length: "+avg);

        //Creates a Dynamically String to add things too
        StringBuilder allNames = new StringBuilder();

        //enhanced for loop to append allNames with name2 which is names the array
        for (String name2 : names) {
            allNames.append(name2 + " ");
        }
        System.out.println(allNames);
//------------------------------------------------------------------------------------------------------------------------
        //3. How do you access the last element of any array?
        // arrayName[arrayName.length - 1];

        // 4. How do you access the first element of any array?
        // arrayName[0];


        //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int[] nameLength = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLength[i] = names[i].length();
        }
        for (int length : nameLength) {
            //System.out.println(length);
        }

        //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int letterSum = 0;

        for (int i = 0; i < nameLength.length; i++) {
            letterSum += nameLength[i];
        }
        System.out.println("sum of nameLength: " + letterSum);

        //----------------------------------------------------------------------------------------------------------------

        //                                         printing out methods

        //concat method
        System.out.println(concat("hello" , 3));

        //fullName method
        System.out.println(fullName("Angel","Perez"));

        //array bigger than 100 method
        int[] bigger = {22,33,100};
        System.out.println(sum(bigger));

        //gets the avg of an array of doubles method
        double[] decimal = {12.3, 45.0, 20.5, 35.6};
        System.out.println("double avg: " + doubleAvg(decimal));

        // checks if the avg of arr1 is bigger than avg arr2
        double[] arr = {22.5,13.1};
        double[] arr2 = {12.5,13.3,4.1,2.4};
        System.out.println("is arr1 bigger? " + biggerAvg(arr, arr2));

        //willBuyDrink method
        System.out.println("Will I buy a drink? " + willBuyDrink(true,10.50));

    }


//-----------------------------------------------------------------------------------------------------------------------
 //                                               1.    array int methods


    //A method that takes a list of int and subtracts the first element of the first element from the last element of the list.
    public static int subtract(int[] subtract){

        //Subtract[0] gets the first element of the list and subtracts the element at index subtract[ages.length-1] which is 0

         int firstElement = subtract[subtract.length - subtract.length];
         int lastElement = subtract[subtract.length-1];
         int sum = 0;

         //gets the age to always be positive
         if (firstElement < lastElement){
             sum = lastElement - firstElement;
         }else {
             sum = firstElement - lastElement;
         }

         return sum ;
    }


    //method that gets the avg of a list
    public static double avg(int[] listAvg){
        //initialize sum to get the total of the list
        int sum = 0;

        //loop through the list to get the total and add it to sum
        for (int i = 0; i < listAvg.length; i++){
            //adds the total from listAvg and assigning it to sum
            sum += listAvg[i];
        }

        //initialize a double to hold the avg of the list.
        // total / total numbers in the list(listAvg.length)
        double avg = sum / listAvg.length;

        //returns the avg
        return avg;
    }

//-------------------------------------------------------------------------------------------------------------------------


    //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

    public static StringBuilder concat (String name, int n){
        //string builder to add to a string
        StringBuilder names = new StringBuilder();

        //loops through the n number of times to concat name
        for (int i = 0; i < n; i++){
            names.append(name);
        }
        //returns names
        return names;
    }



    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
    public static String fullName (String firstName, String lastName){
        //returns the name + lastname
        return firstName + " " + lastName;
    }



    //9. Write a method that takes an array of int and returns true if the sum of all the int in the array is greater than 100.
    public static boolean sum(int[] num){
       //placeholder
        int totalSum = 0;

        //loops through the num.length
        for (int i = 0; i < num.length; i++){
            totalSum += num[i];
            //checks if total is more than 100
            if (totalSum > 100){
                return true;
            }
        }
        return false;
    }


    //10. Write a method that takes an array of double and returns the average of all the elements in the array.
    public static double doubleAvg(double[] doubleArray){
        //place holder
        double sum = 0;

        //loops through the array of double
        for(int i = 0; i < doubleArray.length; i++){
            sum += doubleArray[i];
        }
        return sum / doubleArray.length;
    }



   // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
    public static boolean biggerAvg(double[] arr1, double[] arr2){
        //placeholder for total of arr1
        double arrSum1 = 0;
        double avg = 0;

        //placeholder for total of arr2
        double arrSum2 = 0;
        double avg2 = 0;

        //loops through the array1
        for (int i = 0; i < arr1.length; i++){
            arrSum1 += arr1[i];
        }
        //loops through the array2
        for (int j = 0; j < arr2.length; j++){
            arrSum2 += arr2[j];
        }
        //gets the avg
        avg = arrSum1 / arr1.length;
        avg2 = arrSum2 / arr2.length;

        //checks if arrSum1 is bigger than bigger than arrSum2
        if (avg > avg2){
            return true;
        }
        return false;
    }



    //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
        //checks if isHotOutside is true and if money in pocket is greater than or equal to 10.50
        if (isHotOutside && moneyInPocket >= 10.50){
            return true;
        }
        return false;
    }


    /*13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.



        //Subtract[0] gets the first element of the list and subtracts the element at index subtract[ages.length-1] which is 0

         int firstElement = subtract[subtract.length - subtract.length];
         int lastElement = subtract[subtract.length-1];
         int sum = 0;

         //gets the age to always be positive
         if (firstElement < lastElement){
             sum = lastElement - firstElement;
         }else {
             sum = firstElement - lastElement;
         }

         return sum ;
    }


     */


}