package exceptionhandling.serverconfigurationloader;

import java.util.Scanner;

public class LoaderApp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Input the name of the file: ");
            String file = input.nextLine();
            ConfigLoader configLoader = new ConfigLoader();
            configLoader.loadConfig(file);
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        } finally{
            input.close();
        }

        

    }
    
}
