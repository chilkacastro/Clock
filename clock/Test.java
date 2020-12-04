/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 * Test Class for Clock
 * @author Chilka Castro
 */
public class Test {
    public static void main(String[] args) {
        Clock c = new Clock(14, 55, 2);
        Clock c2 = new Clock(c);
  
        c.setHr(0);
        System.out.println(c2);

        for(int i = 0; i < 10000; i++) {
            c.increaseSe();
            System.out.println(c);
        }

    } 
}
//        public static void main(String[] args) {
//           // Objects
//            Student stu1 = new Student("Yi", 35, "male", 
//                    new Address("123","35", "Main Street", "Montreal", "QC", "A1A A1A" ));
//            System.out.println(stu1);
//         
//        
//            // Output
//            stu1.setAddress(new Address("223","35", "Main Street", "Montreal", "QC", "A1A A1A" ));           // you can only call non-static method through an object                                     // when you print this, you are actually calling the toString method
//            //student object | 
//            stu1.getAddress().setAptNum("223");
//            stu1.getAddress().setZipcode("b2b 2b2");
//            System.out.println(stu1);
//
//            stu1.getAddress().setCity("Toronto");
//            stu1.getAddress().setProvince("ON");
//            stu1.checkDistance();
//
//                   
//            // System.out.println(Student.toString());  // you are just a class-> you dont have any real value inside
//        
//           //  System.out.println(s1.isNameValid("hello")); -> calling a static method through an object and the isNameVaid belongs to the clasa
//            System.out.println(Student.isNameValid("hello")); // call static method throguth a class.
//        
//        }
//        
//        
//        
//}      
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//       
//      // this is an object
//       //Student stu = new Student("Yi", "123", 35, "123456789");  // Yi object's name.. id.. age..telephone number
//       //Student stu2 = new Student("Yi", "123", 35);
//    // Scanner console = new Scanner(System.in); // CONSTRUCTOR! class name(method of a class)
//    // Random rand = new Random(); // Random-> constructor
//      // Student stu3 = new Student();
//
