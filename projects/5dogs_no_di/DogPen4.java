public class DogPen4 {
  Dog1 dog1;
  Dog2 dog2;
  Dog3 dog3;
  Dog4 dog4;
  DogPen4() {
    this.dog1 = new Dog1("Dog1");
    this.dog2 = new Dog2("Dog1", "Dog2");
    this.dog3 = new Dog3("Dog1", "Dog2", "Dog3");
    this.dog4 = new Dog4("Dog1", "Dog2", "Dog3", "Dog4");
  }
}
