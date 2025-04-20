
// class Student {

//      String name="Goutham";
//      int Roll_number=55;
//      int Age=19;

//      void display(){
//         System.out.println("name is "+name );
//         System.out.println("Roll number is "+Roll_number );
//         System.out.println("age is "+Age );
//    }  
//    public static void main(String[] args) {
//         Student s =new Student();
//         s.display();
//      }
    
    
// }




class Student implements Cloneable{
     String name;
      int Roll_number;
      int Age;
       public static void main(String[] args) {
          Student obj1=new Student();

          // initalize the variables
          obj1.name="Goutham";
          obj1.Roll_number=12;
          obj1.Age=20;

          System.out.println("name is "+obj1.name );  
          System.out.println("Roll number is "+obj1.Roll_number );
          System.out.println("age is "+obj1.Age );


          try{
               // create the clone for obj1
               Student obj2 =(Student)obj1.clone();


               System.out.println("name is "+obj2.name );
               System.out.println("Roll number is "+obj2.Roll_number );
               System.out.println("age is "+obj2.Age );


          }catch(Exception e){
               System.out.println("Exception"+e);
          }




          

          
          
     }
}



