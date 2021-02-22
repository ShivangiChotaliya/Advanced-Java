
class Movie {

    private String name;
    private String directors;
    private int runtime;
    private int released;
    private String cast;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDirectors(){
        return directors;
    }
    public void setDirector(String directors){
        this.directors = directors;
    }

    public int getRuntime(){
        return runtime;
    }
    

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

   
   
    public int getReleased(){
        return released;
    }

    public void setReleased(int released){
        this.released = released;
    }

    public String getCast(){
        return cast;
    }

    public void setCast(String cast){
        this.cast = cast;
    }


    
    @Override
    public String toString(){
        return "Movies [name=" + name + ", Directors=" + directors + ", runtime=" + runtime + ", released=" + released + ", cast=" + cast + "|";

    }
}
