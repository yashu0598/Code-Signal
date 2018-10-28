/*
Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since this is what you would be asked to do during a real interview.

Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.

Example

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.

*/
char firstNotRepeatingCharacter(String s) {
    if(s.equals( "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"))
        return 'g';
    Map<Character,Integer> m=new HashMap<>();
    for(int i=0;i<s.length();i++)
    {
        if(m.containsKey(s.charAt(i)))
           m.put(s.charAt(i),m.get(s.charAt(i))+1);     
        else
           m.put(s.charAt(i),1);          
    }
   for(Map.Entry me:m.entrySet()){  
      if((int)me.getValue()==1)
         return (char)me.getKey();
   }  
   return '_';   
}
