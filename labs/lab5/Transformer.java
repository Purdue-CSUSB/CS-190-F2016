class Transformer{
  String myString;
  public Transformer(String myString){
    this.myString = myString;
  }

  /**
   * Returns a capitalized version of myString.
   * The capitalization strategy is as follows.
   * First the string is split on spaces.
   * Each word in the string should then have the first letter capitalized.
   *
   *
   * @return       a capitalized version of myString (capitalized as described)
   */
  public String capitalize(){
    // split the string into tokens (words) on a space character
    String[] words = myString.split("\\s");
    StringBuilder sb = new StringBuilder();

    // iterate through each word found
    for (int i = 0; i < words.length; i++){
      // convert the current word to a character array to easily access each character
      char[] currWordChars = words[i].toCharArray();
      // iterate through each character in the array
      for (int j = 0; j < currWordChars.length; j++){
        // and test to see if we want to capitalize it
        if (j != 0){
          currWordChars[j] = Character.toUpperCase(currWordChars[j]);
        }
      }
      // add this capitalized string and a space to the current word
      sb.append(new String(currWordChars));
      sb.append(" ");
    }
    return sb.toString();
  }

  /**
   * Returns the reverse of myString.
   * The resulting string should contain the letters of a string in reverse
   * order. If myString is "cat" then the output should be "tac".
   *
   *
   * @return       a reversed version of myString (described above)
   */
  public String reverse(){
    char[] stringContents = myString.toCharArray();
    // This temp variable will store the character while we swap two elements
    char temp;
    int len = stringContents.length;
    // We'll iterate through each character in the string
    for (int i = 0; i < len; i++){
      // and we'll swap the outer characters and work inwards
      // save the current character in a temp variable
      temp                        = stringContents[i];
      // the last element in the string is placed into the current element's spot in the array
      stringContents[i]           = stringContents[len - i - 1];
      // the last spot in the array is set to the current element
      stringContents[len - i - 1] = temp;
      // reset temp every time to a garbage value **Not necessary for algorithm to work**
      // only useful for debugging
      temp = 'A';
    }
    return new String(stringContents);
  }


  public static void main(String args[]){
    String source = "cs190 is sooooooo awesome!!!";
    Transformer t = new Transformer(source);

    System.out.println( "Original Input is: " + source);
    System.out.println( "==================");
    System.out.println( "Capitalized Version: ");
    System.out.println( "=====================");
    System.out.println( t.capitalize() );
    System.out.println( "==================");
    System.out.println( "Reversed Version: ");
    System.out.println( "==================");
    System.out.println( t.reverse() );
  }
}
