public class PallendroneNumber {
    public boolean isPalindrome(int x) {
    int num = 0;
    int pallenrone = x;
    while (x > 0) {
      int lastDigit = x % 10;
      num = num * 10 + lastDigit;
      x = x / 10;
    }
    if (num == pallenrone) {
      return true;
    } 
    return false;
        
    }
}