/**
 
 * This is the driver file for the program
 * This program is used to search the information by inputting town and state
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Scanner;


public class search_by_arraylist {


    public static void main(String[] args){
        //set up variables
        String line;
        String storeString;
        String fileName= "zipCodes.txt";
        String[]storeString2;
        ArrayList<Place> places= new ArrayList<>();

        int i=0;

        try{
            System.out.println("Please input the town,state information in a format as Bryn Mawr,PA");
            //ask user to input and follow the right format
            FileReader inputFile = new FileReader(fileName);
            BufferedReader bufferReader = new BufferedReader(inputFile);

           //input files

            while ((line = bufferReader.readLine()) != null)   {

                storeString=line;//store each line from the stream
                storeString2=storeString.split(",");//split it by tab

                Place place=new Place(storeString2[0].trim(),storeString2[1].trim(),storeString2[2].trim(),storeString2[3].trim(),storeString2[5].trim(),storeString2[6].trim(),storeString2[9].trim());

                places.add(place);


                i++;
            //fill the data to the place objects


            }
            bufferReader.close();
            int q=search(places);
            //do the input and search using the search static method.
            if(q!=99999) {

                System.out.println(places.get(q).toString());
                //if we found the place the user input, print the out
                System.out.println("Comparison between places: "  +(q+1)+" Total Comparison: "+(q+1)*2);
                //if we find the place, calculate the count times

            }else{
		System.out.println("Your format is correct, but the location information is not found. Please check your spelling."+ "Comparison between places:  "+places.size()+" Total Comparisons: "+places.size()*2);
            //if we cannot find the place, notice the user
            }

        }catch(Exception e){
            System.out.println("Your format of the input is incorrect");
            //if the user did not use comma in the input, notice the user the format is incorrect
        }

    }
    //search method, which serves the input and search function
    public static int search(ArrayList<Place> places){
        Scanner sysIn;
        String input;
        sysIn=new Scanner(System.in);
        input= sysIn.nextLine ();
        //input
        System.out.println("Query: "+input);
        System.out.println("Found...");
        String[] inputo=input.split(",");
        String stateIn= inputo[1].trim();
        String townIn=inputo[0].trim();
        //split the input
        //do linear search
        for(int i=0;i<places.size();i++){
            if(places.get(i).getState().toLowerCase().equals(stateIn.toLowerCase())&&places.get(i).getTown().toLowerCase().equals(townIn.toLowerCase())){
               return i;
            //return the index we found the place
            }

        }
        //if not found , return 99999 which will be checked above
        return 99999;

    }
}
