import java.util.*;
public class recursive0{
public static List<String> makeAllWords(int k, int maxLetter){
  ArrayList<String> aryans = new ArrayList<String>();
  helper(k, aryans, "", maxLetter);
  return aryans;
}
private static void helper(int k,ArrayList<String> aryans, String word, int maxLetter){
  if (k == 0){
    aryans.add(word);
  }
  else{
    for(int n = 0; n < maxLetter; n ++){
      helper(k -1, aryans, word + (char)('a'+n), maxLetter);
    }
}

}
public static void main(String[] args){
  System.out.println(makeAllWords(2,26));
}
}
