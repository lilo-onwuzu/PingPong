import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void checkPingPong_forCountUp(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> fullArray = new ArrayList<Object>();
    fullArray.add(1);
    fullArray.add(2);
    assertEquals(fullArray, testPingPong.checkPingPong(2));
  }

  @Test
  public void checkPingPong_forDivisibleBy3ButNot15(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> fullArray = new ArrayList<Object>();
    fullArray.add(1);
    fullArray.add(2);
    fullArray.add("ping");
    assertEquals(fullArray,testPingPong.checkPingPong(3));
  }

  @Test
  public void checkPingPong_forDivisibleBy5ButNot15(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> fullArray = new ArrayList<Object>();
    fullArray.add(1);
    fullArray.add(2);
    fullArray.add("ping");
    fullArray.add(4);
    fullArray.add("pong");
    assertEquals(fullArray,testPingPong.checkPingPong(5));
  }

  @Test
  public void checkPingPong_forDivisibleBy15(){
    PingPong testPingPong = new PingPong();
    ArrayList<Object> fullArray = new ArrayList<Object>();
    for (Integer index = 1; index <= 15; index++) {
      if (index % 3 == 0 && index % 15 != 0) {
        fullArray.add("ping");
      } else if (index % 5 == 0 && index % 15 != 0){
          fullArray.add("pong");
        } else if (index % 15 == 0){
            fullArray.add("pingpong");
          } else {
              fullArray.add(index);
            }
    }

    assertEquals(fullArray, testPingPong.checkPingPong(15));
  }

}
