import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count  = 0;
    for(int x = 0; x < myList.size(); x++){
      if(myList.get(x).size() == len)
        count++;
    }
    return count;
    
  }

  public void removeWordsOfLength(int len)
  {
   for(int x  = 0; x<myList.size(); x++){
     if(myList.get(x).size() == len){
       myList.remove(x);
       x--;
     }
  }
}
