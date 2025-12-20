class Pen{
    String color;
    String type;
    public void write(){
        System.out.print("hello");
    }
    public void print(){
        System.out.print(this.color);
    }
}
class Student{    
    String name;
    int age;
    public void printifo(){
        System.out.print(this.name);
         System.out.print(this.age);
    }
    Student(String name ,int age){
       this.name=name;
       this.age=age; 
    }
}
class oops{
    public static void main(String args[]){
      Pen obj=new Pen();
      System.out.print(obj.color="blue");
      obj.write();
      Pen obj2=new Pen();
      obj2.color="red";
      obj.print();
      obj2.print();
      
      
      Student stu=new Student("jatin",65);
    //    stu.name="jatin";
//  stu.age=20;
 stu.printifo();
      
    }
}