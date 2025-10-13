public abstract class Pet {

   protected String name;
   protected int age;
   
   public abstract void speak();
   
   public void setName(String userName) {
      name = userName;
   }

   public String getName() {
      return name;
   }

   public void setAge(int userAge) {
      age = userAge;
   }

   public int getAge() {
      return age;
   }

   public void printInfo() {
      System.out.println("Pet Information: ");
      System.out.println("   Name: " + name);
      System.out.println("   Age: " + age);
   }
   
   @Override
   public boolean equals(Object obj) {
	   //Cast the parameter as the correct type
	   Pet other = (Pet) obj;
	   
	   if (this.name.equals(other.name)) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   @Override
   public String toString() {
	   return "a pet";
   }

}
