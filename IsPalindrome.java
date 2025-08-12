// My first try
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int leftN = 0, rightN = s.length()-1;
        for(;leftN < s.length() && rightN >= 0; leftN++) {
            if(!Character.isLetterOrDigit(s.charAt(leftN))) {
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(rightN))) {
                rightN--;
                leftN--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(leftN)) != Character.toLowerCase(s.charAt(rightN))) {
                return false;
            }
            rightN--;
        }
        return true;
    }
}

// Another but with better code
class IsPpalidrome {
  public boolean isPalidrome(String s) {
      int left = 0, right = s.length() - 1;
      while (left < right) {
          // Mover left hasta encontrar un carácter alfanumérico o pasar right
          while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
              left++;
          }

          // Mover right hasta encontrar un carácter alfanumérico o pasar left
          while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
              right--;
          }

          // Comparar caracteres ignorando mayúsculas/minúsculas
          if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
              return false;
          }

          left++;
          right--;
      }

      return true;
  }
}