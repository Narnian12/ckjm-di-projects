public class main {
  public static void main(String args[]) {
    DogBuilder dB = new DogBuilder();
    DogPen1 dP1 = new DogPen1(dB.getDog1(), dB.getDog2(), dB.getDog3(), dB.getDog4(), dB.getDog5(), dB.getDog6());
    DogPen2 dP2 = new DogPen2(dB.getDog1(), dB.getDog2(), dB.getDog3(), dB.getDog4(), dB.getDog5(), dB.getDog6());
    DogPen3 dP3 = new DogPen3(dB.getDog1(), dB.getDog2(), dB.getDog3(), dB.getDog4(), dB.getDog5(), dB.getDog6());
    DogPen4 dP4 = new DogPen4(dB.getDog1(), dB.getDog2(), dB.getDog3(), dB.getDog4(), dB.getDog5(), dB.getDog6());
    DogPen5 dP5 = new DogPen5(dB.getDog1(), dB.getDog2(), dB.getDog3(), dB.getDog4(), dB.getDog5(), dB.getDog6());
  }
}
