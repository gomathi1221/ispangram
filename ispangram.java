class Solution {
    public boolean checkIfPangram(String sentence) {
      Set<Character> s=new HashSet<>();
     for(char t:sentence.toCharArray()){
        s.add(t);
     }
      if(s.size()==26){
        return true;
      }
      return false;
    }
}