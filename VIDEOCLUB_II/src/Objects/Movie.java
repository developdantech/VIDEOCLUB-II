/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class Movie {
   private String title;
   private String genre;
   private int year;
   private Time duration; 

    public Movie(String title, String genre, int year, String duration) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = calculateDuration(duration);
    }
    private Time calculateDuration (String duration){
        String inputFormat = "HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(inputFormat);
        try {
            Date date = sdf.parse(duration);
            Time time = new Time(date.getTime());
            return time;
        } catch (ParseException e){
            e.printStackTrace();
            return null;
        }
    } 
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getYear(){
        return this.year;
    }
    public Time getDuration(){
        return this.duration;
    }
}
