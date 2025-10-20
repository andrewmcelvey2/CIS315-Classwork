public class EmployeeData implements Comparable<EmployeeData> {
   private String firstName; // First Name
   private String lastName;  // Last Name
   private Integer emplID;   // Employee ID
   private Integer deptNum;  // Department Number
   
   EmployeeData(String firstName, String lastName, Integer emplID, Integer deptNum) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.emplID = emplID;
      this.deptNum = deptNum;
   }
   
   public String toString() {
	   return firstName + " " + lastName + " " + emplID + " " + deptNum;
   }
   
   public int compareTo(EmployeeData other) {
	   String name = lastName + ", " + firstName;
	   String otherName = other.lastName + ", " + other.firstName;
	   
	   return firstName.compareTo(other.firstName);
	   
//	   if (emplID == other.emplID) {
//		   return 0;
//	   } else if (this.emplID < other.emplID) {
//		   return -1;
//	   }
//	   return 1;
   }

}