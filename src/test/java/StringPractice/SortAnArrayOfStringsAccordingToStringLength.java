package StringPractice;

/**
 * https://www.geeksforgeeks.org/sort-array-strings-according-string-lengths/
 * https://www.geeksforgeeks.org/sort-an-array-of-strings-according-to-string-lengths-using-map/?ref=rp
 */
public class SortAnArrayOfStringsAccordingToStringLength {

    static void sortAccordingToStringLength(String[] strings1, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = strings1[i];
            int j = i-1 ;
            while (j >= 0 && temp.length() < strings1[j].length())
            {
                strings1[j+1] = strings1[j];
                j--; // why are we decreasing j
            }
            strings1[j+1] = temp;
        }
        printArrayString(strings1,n);
    }

    static void printArrayString(String[] str, int n)
    {
        for (int i=0; i<n; i++)
            System.out.print(str[i]+" ");
    }

    public static void main(String[] args)
    {
        String []arr = {"I", "GeeksforGeeks", "from", "am"};
        int n = arr.length;
        sortAccordingToStringLength(arr,n);
    }
}
