public class DogPen3 {
  Dog1 dog1;
  Dog2 dog2;
  Dog3 dog3;
  DogPen3() {
    this.dog1 = new Dog1("Dog1");
    this.dog2 = new Dog2("Dog1", "Dog2");
    this.dog3 = new Dog3("Dog1", "Dog2", "Dog3");
  }
}
