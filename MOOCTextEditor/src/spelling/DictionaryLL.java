package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	
	 private int size = 0;
	
    // TODO: Add a constructor
	 public DictionaryLL()
	    {
	        this.dict = new LinkedList<String>();
	    }

    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	  if (isWord(word))
              return (false);
          else
              this.dict.add(word.toLowerCase());
          this.size++;
          return (true);
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
        // TODO: Implement this method
    	 return (size);
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
        //TODO: Implement this method
    	if (this.size == 0)
            return (false);
        s = s.toLowerCase();
        for (String word : this.dict)
        {
            if (word.equals(s))
            {
                return (true);
            }
        }
        return (false);
    }

    
}
