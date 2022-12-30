package java_test;

public class Permutation {
	
	public static void main(String[] args)
    {
        String per = "ABC";
        int n = per.length();
        Permutation permutation = new Permutation();
        permutation.permute(per, 0, n - 1);
    }
	
    private void permute(String mute, int l, int r)
    {
        if (l == r)
            System.out.println(mute);
        else {
            for (int i = l; i <= r; i++) {
                mute = swap(mute, l, i);
                permute(mute, l + 1, r);
                mute = swap(mute, l, i);
            }
        }
    }
 
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
