package Test;
import java.util.Scanner;
public class FindString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b = input.nextLine();
		int count = substrCount(a,b);
		System.out.println(count);

	}
	public static int substrCount(String str, String sub) {
		int start = 0, count = 0;
		while( (start = str.indexOf(sub, start)) != -1) {
			start++;
			count++;
		}
		return count;
	}

}
//自己写indexof
/*
int n = 0;
for(int i = 0; i < str1.length(); i++){
    int count = 0;
    for(int j = 0; j < str2.length(); j++)
    {
        if(str1.charAt(i + count) == str2.charAt(j)){
           count++;
        }
        else break;
    }
    if(count == str2.length())
       n++;
}
*/



//indexof源码
/*
  Code shared by String and AbstractStringBuilder to do searches. The
  source is the character array being searched, and the target
  is the string being searched for.
 static int indexOf(byte[] src, byte srcCoder, int srcCount,
                       String tgtStr, int fromIndex) {
        byte[] tgt    = tgtStr.value;
        byte tgtCoder = tgtStr.coder();
        int tgtCount  = tgtStr.length();

        if (fromIndex >= srcCount) {
            return (tgtCount == 0 ? srcCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (tgtCount == 0) {
            return fromIndex;
        }
        if (tgtCount > srcCount) {
            return -1;
        }
        if (srcCoder == tgtCoder) {
            return srcCoder == LATIN1
                ? StringLatin1.indexOf(src, srcCount, tgt, tgtCount, fromIndex)
                : StringUTF16.indexOf(src, srcCount, tgt, tgtCount, fromIndex);
        }
        if (srcCoder == LATIN1) {    //  && tgtCoder == UTF16
            return -1;
        }
        // srcCoder == UTF16 && tgtCoder == LATIN1) {
        return StringUTF16.indexOfLatin1(src, srcCount, tgt, tgtCount, fromIndex);
    }

 */
