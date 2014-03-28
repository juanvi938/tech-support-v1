import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private ArrayList<String> respuestas;
    private HashMap<String,String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        responses = new HashMap<String,String>();
        respuestas = new ArrayList<>();
        responses.put("software", "Checks for software updates");
        responses.put("parameters", "The software parameters are right?");
        responses.put("requirements", "Are you check the requirements to run the software?");
        responses.put("running", "Check that you have no other software running");
        responses.put("storage", "Check if your system has enougth storage to run the software");
        
        respuestas.add("Checks for software updates");
        respuestas.add("The software parameters are right?");
        respuestas.add("Are you check the requirements to run the software?");
        respuestas.add("Check that you have no other software running");
        respuestas.add("Check if your system has enougth storage to run the software");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> word)
    {
        String response = null;
        for(String element : word)
        {
            if(responses.containsKey(element))
            {
                response = responses.get(element);
            }
        }
        if(response == null){
            response = respuestas.get(rnd.nextInt(respuestas.size()));
        }  
        
        return response;
    }
}
 