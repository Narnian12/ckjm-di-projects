public class DogBuilder {
  public Dog1 dog1;
  public Dog2 dog2;
  DogBuilder() {
    this.dog1 = new Dog1();
    this.dog2 = new Dog2();
  }

  Dog1 getDog1() { return dog1; }
  Dog2 getDog2() { return dog2; }
}
