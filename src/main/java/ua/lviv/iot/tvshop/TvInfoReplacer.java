package ua.lviv.iot.tvshop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TvInfoReplacer {
  
  /**
   * Replaces TV products name, model, and product line name with "TV_SET" text.
   * 
   * @param text is a text transferred
   * @param changeStr TV_SET str
   * @return returns replaced text
   */
  public static String replaceTvInfo(String text, String changeStr) {
    String patternString = 
        "(Samsung|Lenovo|Sony) \\b[a-zA-Z_0-9]{1,100}\\b \\b[a-zA-Z_0-9]{1,100}\\b";
    Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(text);
    text = matcher.replaceAll(changeStr);
    return text;
  }
}