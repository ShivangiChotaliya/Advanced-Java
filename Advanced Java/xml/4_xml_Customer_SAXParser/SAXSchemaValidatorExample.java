import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.InputSource;


class SAXSchemaValidatorExample {
    public static void main(String[] args) {
        String schemaName = "myCustomer.xsd";
        String xmlName = "myCustomer.xml";
        Schema schema = loadSchema(schemaName);
        
        // call validate method to validate the xml with schema
        validateXML(schema, xmlName);
    }    
    public static void validateXML(Schema schema, String xmlName){
        try{
            //creating a validator instance
            Validator validator = schema.newValidator();
            System.out.println();
            System.out.println("Validator Class: " + validator.getClass().getName());

            //preparing the xml file as a SAX Source
            SAXSource source = new SAXSource(new InputSource(new java.io.FileInputStream(xmlName)));

            //validating the SAX source againts the scema
            validator.validate(source);
            System.out.println("Validation passed.");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    /**
  * This method is used to load the schema name provide to the method.
  * 
  * @param name
  * @return
  */
    public static Schema loadSchema(String name){
        Schema schema = null;
        try{
            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            SchemaFactory factory = SchemaFactory.newInstance(language); 
            schema = factory.newSchema(new File(name));

        }catch(Exception e){
            System.out.println(e.toString());
        }
        return schema;
    }
}
