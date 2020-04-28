package ua.lviv.iot.tvshop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.tvshop.TvInfoReplacer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class TvInfoReplacerTest {

  @Test
  void replaceTvInfoTest() {
    String text = "Samsung Syncmaster 550b iPhone 11Pro Max Sony BigScreen5000 Jaeggernaut "
        + "Lol Lenovo GreatTV 2008Series UwU SONY VERYgoodTV PleaseBuySeries";
    InputStream in = new ByteArrayInputStream(text.getBytes());
    System.setIn(in);
    Scanner scanner = new Scanner(System.in);
    text = scanner.nextLine();
    String expected = "TV_SET iPhone 11Pro Max TV_SET Lol TV_SET UwU TV_SET";
    String actual = TvInfoReplacer.replaceTvInfo(text, "TV_SET");
    assertEquals(expected, actual);
    scanner.close();
  }
}
