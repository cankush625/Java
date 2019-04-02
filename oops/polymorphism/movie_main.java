package com.oops.polymorphism;

class movie {
    private String name;

    public movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Border extends movie{
    public Border() {
        super("Border");
    }

    public String plot(){
        return "India wins the war";
    }
}

class Independence_day extends movie{
    public Independence_day() {
        super("LOC_Kargil");
    }

    @Override
    public String plot() {
        return "India wins the Kargil war";
    }
}

class StarWars extends movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take ovr the universe";
    }
}

class forgetable extends movie{
    public forgetable() {
        super("Forgetable");
    }

    //No plot method
}

public class movie_main{
    public static void main(String[] args){
        for(int i=1; i<11; i++) {
            movie movie_ = randomMovie();
            System.out.println("Movie #" +i +
                            " : " + movie_.getName() + "\n"
                            + "Plot : " + movie_.plot() + "\n");
        }
    }

    public static movie randomMovie(){
        int randomMovie = (int) (Math.random() * 4) + 1;
        System.out.println("random number generated is  : "+randomMovie);
        switch(randomMovie){
            case 1:
                return new Border();

            case 2:
                return new Independence_day();

            case 3:
                return new StarWars();

            case 4:
                return new forgetable();
        }
        return null;
    }
}

//By Ankush Chavan