/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Objects.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MovieService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    private List<Movie> movies = new ArrayList<>();
    
    public void createMovie(){
        System.out.println("Please enter the title for the new movie: ");
        String title = sc.next();
        
        System.out.println("Please enter the genre for the new movie: ");
        String genre = sc.next();
        
        System.out.println("Please enter the premier year: ");
        int year = sc.nextInt();
        
        System.out.println("Please enter the duration in format HH:MM:ss ");
        String duration = sc.next();
        Movie newMovie = new Movie(title, genre, year, duration);
        this.movies.add(newMovie);
        System.out.println("Movie successfully created, please select an option to continue \n");
    }
    
    public void listMovies(){
        
        if(movies.isEmpty()){
            System.out.println("The movies list es empty, you can create a new one.");
            
        }else {
            System.out.println("this is the entire movie list: ");
            int index = 1;
            for(Movie movie : this.movies){
            System.out.println(index);
            System.out.println("Title: " + movie.getTitle() + ", " + "Genre: " + movie.getGenre() + ", " + "Year: " + movie.getYear() + ", " + "Duration: " + movie.getDuration().toString());
            index++;
        }
        System.out.println("These are the movies on the list \n");
        }
    }
}
