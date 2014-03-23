import java.util.Random;
import java.util.ArrayList;
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
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        responses = new ArrayList<>();
        responses.add("Checks for software updates");
        responses.add("The software parameters are right?");
        responses.add("Are you check the requirements to run the software?");
        responses.add("Check that you have no other software running");
        responses.add("Check if your system has enougth storage to run the software");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int indexRandom = rnd.nextInt(5);
        return responses.get(indexRandom);
    }
}
 