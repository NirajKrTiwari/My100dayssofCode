public class DisplayFirstRepeatingChar {

        static char firstRep(String S)
        {
            for(int i=0;i<S.length();i++)
            {
                for(int j=i+1;j<S.length();j++)
                {
                    if(S.charAt(i)==S.charAt(j))
                    {
                        return S.charAt(i);
                    }
                }
            }
            return '#';
        }

    public static void main(String[] args) {
        String S="geeksofgeeks";

        System.out.println(firstRep(S));
    }

}
