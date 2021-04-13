import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

//code by kenneth yeon
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		//Create an ArrayList
    ArrayList<String> delimeters = new ArrayList<String>();
    //Loop through the array
    for (int i = 0; i < tokens.length; i++)
    {
      //if current is open 
      if (tokens[i].equals(openDel))
      {
        //add to ArrayList
        delimeters.add(tokens[i]);
      }
      //if current is closed
      if(tokens[i].equals(closeDel))
      {
        //add to ArrayList
        delimeters.add(tokens[i]);
      }
    }
    //return ArrayList
    return delimeters;
	}

//code by Kenneth Yeon
	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
	  //int variable
    int counter = 0;
    //loop through ArrayList
    for(int i = 0; i < delimiters.size(); i++)
    {
      //if open
      if (delimiters.get(i).equals(openDel))
      {
        //add one to counter
        counter++;
      }
      //if closed
      if (delimiters.get(i).equals(closeDel))
      {
        //subtract from counter
        counter--;
      }
      //if variable < 0
      if (counter < 0)
      {
        //return false
        return false;
      }
      //if variable = 0
    }
    //if variable = 0
    if (counter == 0)
    {
      //return true
      return true;
    }
    //return false
    return false;
}
}