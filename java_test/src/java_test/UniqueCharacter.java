package java_test;

public class UniqueCharacter {
	
	boolean uniqueCharacters(String unique)
    {
        for (int i = 0; i < unique.length(); i++)
            for (int j = i + 1; j < unique.length(); j++)
                if (unique.charAt(i) == unique.charAt(j))
                    return false;
        return true;
    }
 
    public static void main(String args[])
    {
    	UniqueCharacter uni = new UniqueCharacter();
        String input = "Chandru";
 
        if (uni.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
        else
            System.out.println("The String " + input + " has duplicate characters");
    }

}
