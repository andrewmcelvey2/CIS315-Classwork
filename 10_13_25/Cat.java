public class Cat extends Pet {
   private String breed;

   public void setBreed(String userBreed) {
      breed = userBreed;
   }
   
   @Override
   public void speak() {
	   System.out.println("meow");
   }

   public String getBreed() {
      return breed;
   }
   
   @Override
   public String toString() {
	   return "a pet";
   }
}