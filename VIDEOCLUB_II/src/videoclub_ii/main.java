/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub_ii;

import Services.MovieService;
import Services.RentService;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        MovieService movieService = new MovieService();
        RentService rentService = new RentService (movieService);
//        movieService.initialMovie();
        int option = 0;
        System.out.println("Welcome to your movie club, please select an option to start");
        
        do{
            System.out.println("1. Create movie. \n"
                    + "2. List movies. \n"
                    + "3. Create a Rent. \n"
                    + "4. List Rented movies \n"
                    + "5. Find a movie by title \n"
                    + "6. Find a movie by genre \n"
                    + "7. Find a rent by date \n"
                    + "9. Finish");
            option = sc.nextInt();
                    
            switch(option){
                    case 1:
                        movieService.createMovie();
                        break;
                    case 2:
                        movieService.listMovies();
                        break;
//                    case 3:
//                        movieService.findByTitle();
//                        break;
//                    case 4:
//                        movieService.findByGenre();
//                        break;
//                    case 5:
//                        rentService.createRent();
//                        break;
//                    case 6:
//                        rentService.listRents();
//                        break;
//                    case 7:
//                        rentService.findByDate();
//                        break;
                    case 9:
                        System.out.println("Good bye");
                        break;
                    default:
                        System.out.println("Select a valid option");
            }
        }while(option != 9);
    }
    
}
