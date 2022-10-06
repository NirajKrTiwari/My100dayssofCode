public class StringReverse {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int j=0,k=s.length-1;
        for(int i=(s.length/2)-1;i>=0;i--)
        {
            char temp=s[k];
            s[k]=s[j];
            s[j]=temp;
            j++;k--;
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]);
        }
    }
}
