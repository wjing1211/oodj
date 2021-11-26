/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Scanner;
import user.People;
import user.Committee;
import user.Appointment;
import user.Report;
import user.Supply;
import user.Vaccine;

/**
 *
 * @author user
 */
public class User {
    
    static Scanner scan = new Scanner( System.in ); //capture user-input
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runVerifylogin();
    }
    
    static void Verifylogin(){
        public String username;
        public String password;
        public String choice;
                
        do {
            System.out.println("Welcome to Covid19 Vaccine Registeration System");
            System.out.println("1. Committee");
            System.out.println("2. People");
            System.out.println("Please choose your identity (1 OR 2): ");
            choice = scan.next();
            
            for(int i = 0; i<1.list.size();i++){
            if (choice = "1"){
                System.out.println("Welcome Commmittee!");
                runCommittee();
            } else{
                System.out.println("Welcome People!");
                runPeople();
            }
        }
            
        } while(true);
    }
    
}
