public class CountYZ2 {
  public int countYZ(String str) {
    str = str.toLowerCase();
    int count = 0;
    int len = str.length();

    for (int i = 0; i < len; i++) {
      if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
        if (i < len - 1  && !Character.isLetter(str.charAt(i + 1))) {
          count++;
        } else if (i == len - 1) {
          count++;
        }
      }
    }
    return count;
  }
}
