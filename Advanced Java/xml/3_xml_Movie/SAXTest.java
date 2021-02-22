import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;


class SAXTest {

    public static void main(String[] args) throws ParserConfigurationException,SAXException,IOException {
       
    try{
         
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();
        SAXHandler handler = new SAXHandler();
        Path path = Paths.get("E:/MCA-4/Advanced_JAVA/prcticle/xml2","movies.xml");

        parser.parse(path.toFile(), handler);
        DVD dvd =handler.getDvd();
        
        List<Movie> movies = dvd.getMovies();
        System.out.println("DVD Name: " + dvd.getName());
        for(Movie movie:movies){
            System.out.println(movie);
        }
    
    }catch(Exception ex){
        ex.printStackTrace(System.err);
    }

    }
}
