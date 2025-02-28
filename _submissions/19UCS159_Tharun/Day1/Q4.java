/*
Palindrome String : https://www.interviewbit.com/problems/palindrome-string/

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 
*/
public class Q4 {
  public int isPalindrome(String A) {
    A = A.toLowerCase();
    char[] s = A.toCharArray();
    int i = 0, j = s.length - 1;
    while (i < j) {
      if (!isValid(s[i])) {
        i++;
        continue;
      }
      if (!isValid(s[j])) {
        j--;
        continue;
      }
      if (s[i] != s[j]) {
        return 0;
      }
      i++;
      j--;
    }
    return 1;
  }

  private boolean isValid(char c) {
    if (c >= 'a' && c <= 'z')
      return true;
    if (c >= '0' && c <= '9')
      return true;
    return false;

  }
}
