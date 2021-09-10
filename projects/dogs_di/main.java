public class main {
  public static void main(String args[]) {
    DogBuilder dB = new DogBuilder();
    DogPen1 dP1 = new DogPen1(dB.getDog1(), dB.getDog2());
    DogPen2 dP2 = new DogPen2(dB.getDog1(), dB.getDog2());
  }
}
