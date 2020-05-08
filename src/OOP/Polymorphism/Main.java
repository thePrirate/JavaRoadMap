package OOP.Polymorphism;

class Movie{
    public String getMovieTitle() {
        return movieTitle;
    }

    private String movieTitle;

    public Movie(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public String plot(){
        return "no plot here";
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats many ppl";
    }
}

class IndependanceDay extends Movie{
    public IndependanceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Alien attempts to take over the Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape the maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the Universe";
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie "+i+" movie is"+ movie.getMovieTitle()+"\n"+"Plot: "+movie.plot()+"\n");
        }
    }
public static Movie randomMovie(){
//        Generate random number
    int randomNumber = (int)(Math.random()*4)+1;
    System.out.println("the random movie number is "+randomNumber);
    switch (randomNumber){
        case 1:
            return new Jaws();
        case 2:
            return new IndependanceDay();
        case 3:
            return new MazeRunner();
        case 4:
            return new StarWars();
    }
    return null;
}
}
