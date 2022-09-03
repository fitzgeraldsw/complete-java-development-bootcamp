package main.models;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

        /**
    * Function name: addMovie
    * @param movie 
    * 
    * Inside the function:
    *   1. adds a movie object
    */
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

        /**
    * Function name: sellMovie
    * @param name (String)
    * 
    * Inside the function:
    *    //nothing
    */
    public void sellMovie(String name) {
        if (!(this.movies.get(getMovieIndex(name)).isAvailable())) {
            throw new IllegalStateException("cannot sell rented movie");
        }
        this.movies.removeIf((movie) -> movie.getName().equals(name));
    }

    /**
     * Function name: rentMovie
     * @param name (String)
     * 
     * Inside the function:
     *    //nothing
     */
    public void rentMovie(String name) {
        this.movies.get(getMovieIndex(name)).setAvailable(false);
    }

    /**
     * Function name: getMovieIndex 
     * @param name (String) 
     * @return (int)
     * 
     * Inside the function:
     *     1. returns index if it finds a movie. 
     *     2. returns -1000 otherwise.
     * 
     */
    public int getMovieIndex(String name) {

        return IntStream.range(0, this.movies.size())
            .filter((i) -> {
                return this.movies.get(i).getName().equals(name);
            })
            .findFirst()
            .orElse(-1000);

        // for (int i = 0; i < this.movies.size(); i++) {
        //     if (this.movies.get(i).getName().equals(name)) {
        //         return i;
        //     }
        // }
        // return -1000;

    }

    /**
     * Function name: returnMovie
     * @param name (String)
     * 
     * Inside the function:
     *    //nothing
     */
    public void returnMovie(String name) {
        // this.movies.get(getMovieIndex(name)).setAvailable(true);
    }

    public boolean contains(Movie movie) {
        return this.movies.contains(movie);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}