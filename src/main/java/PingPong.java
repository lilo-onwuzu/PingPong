import java.util.ArrayList;

public class PingPong {
  public static void main (String[] args) {}

  public ArrayList checkPingPong(Integer pingPongInt){
    ArrayList pingPongArray = new ArrayList();

      for (Integer index = 1; index <= pingPongInt; index++){
        if (index % 3 == 0 && index % 15 != 0) {
          pingPongArray.add("ping");
        } else if (index % 5 == 0 && index % 15 != 0){
            pingPongArray.add("pong");
          } else if (index % 15 == 0){
              pingPongArray.add("pingpong");
            } else {
                pingPongArray.add(index);
              }
      }
      return pingPongArray;
  }
}
