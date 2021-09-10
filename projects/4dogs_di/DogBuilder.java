public class DogBuilder {
  public Dog1 dog1;
  public Dog2 dog2;
  public Dog3 dog3;
  public Dog4 dog4;
  DogBuilder() {
    this.dog1 = new Dog1();
    this.dog2 = new Dog2();
    this.dog3 = new Dog3();
    this.dog4 = new Dog4();
  }

  Dog1 getDog1() { return dog1; }
  Dog2 getDog2() { return dog2; }
  Dog3 getDog3() { return dog3; }
  Dog4 getDog4() { return dog4; }
}
