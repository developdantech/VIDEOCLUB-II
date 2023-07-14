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
    public void findByTitle(){
        System.out.println("Enter the title: ");
        String titleToFind = sc.next();
        boolean found = false;
        int index = 0;
        for(Movie movie : this.movies){
            if(movie.getTitle().toLowerCase().contains(titleToFind.toLowerCase())){
                if(index == 0){
                    System.out.println("Movie(s) found: ");
                }
                System.out.println("Title: " + movie.getTitle() + ", " + "Genre: " + movie.getGenre() + ", " + "Year: " + movie.getYear() + ", " + "Duration: " + movie.getDuration());
                found = true;
                index++;
            }
        }
        if(!found){
            System.out.println("Movie not found");
        }
    }
    public void findByGenre(){
        System.out.println("Enter the genre: ");
        String genreToFind = sc.next();
        boolean found = false;
        int index = 0;
        for(Movie movie : this.movies){
            if(movie.getGenre().toLowerCase().contains(genreToFind.toLowerCase())){
                if(index == 0){
                    System.out.println("Movies found: ");
                }
                System.out.println("Title: " + movie.getTitle() + ", " + "Genre: " + movie.getGenre() + ", " + "Year: " + movie.getYear() + ", " + "Duration: " + movie.getDuration());
                found = true;
                index++;
            }
        }
        if(!found){
            System.out.println("Genre not found");
        }
        
    }
      public void initialMovies(){
        this.movies.add(new Movie("Titanic","Drama", 1984,"03:03:03"));
        this.movies.add(new Movie("Titanic2","Drama", 1984,"03:03:03"));
        this.movies.add(new Movie("Titanic3","Drama", 1984,"03:03:03"));

    }
}
