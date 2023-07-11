/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author User
 */
public class RentService {
    private MovieService movieService;

    public RentService(MovieService movieService) {
        this.movieService = movieService;
    }
    
}
