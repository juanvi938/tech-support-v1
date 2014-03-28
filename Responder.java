import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
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
    private HashMap<String,String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        responses = new HashMap(5);
        responses.put("software", "Checks for software updates");
        responses.put("parameters", "The software parameters are right?");
        responses.put("requirements", "Are you check the requirements to run the software?");
        responses.put("running", "Check that you have no other software running");
        responses.put("storage", "Check if your system has enougth storage to run the software");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String response = "";
        if(responses.containsKey(word))
        {
            response = responses.get(word);
        }else{
            int indexRandom = rnd.nextInt(5);
            return responses.get(indexRandom);
        }
        return response;
    }
}
 