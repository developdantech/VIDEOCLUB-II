/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Objects.Rent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RentService {
    private MovieService movieService;
    private Scanner sc = new Scanner(System.in);
    private List<Rent> rentList = new ArrayList<>();
    

    public RentService(MovieService movieService) {
        this.movieService = movieService;
    }
    
}
