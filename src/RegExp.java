import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

  public static String getIpAddress(String text) {
    String digitRegEx = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    Pattern pattern = Pattern.compile(digitRegEx);
    Matcher matcher = pattern.matcher(text);
    if (!matcher.find()) {
      return "";
    }
    return matcher.group();
  }
}