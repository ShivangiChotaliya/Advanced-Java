import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class SAXHandler extends DefaultHandler {
    DVD dvd = new DVD();
    List movieList = new ArrayList<>();
    Movie movie = null;
    String content = null;
    
    public void startElement(String namespaceURL, String localName, String qname, Attributes attributes){
        if(qname.equals("dvd")){
            String dvdName = attributes.getValue("name");
            dvd.setName(dvdName);

        }else if(qname.equals("movie")){
            movie = new Movie();
        }
    }
    
    public void endElement(String namespaceURL, String localName, String qname){
        switch(qname){
            case "movie": movieList.add(movie); break;
            case "name":  movie.setName(content); break;
            case "directors" : movie.setDirector(content); break;
            case "released": movie.setReleased(Integer.parseInt(content));  break;                       
            case "runtime" : movie.setRuntime(Integer.parseInt(content));  break;
            case "cast" : movie.setCast(content);  break;
            case "dvd" : dvd.setMovies(movieList); break;
        }
    }
    public void characters(char []ch, int start,int length){
        content = new String(ch, start, length);
    }
    public DVD getDvd(){
        return dvd;
    }
}
