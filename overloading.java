
package ShakeStation;


public class overloading {
    String name;
    int age;
    String department;
    
    public overloading(){
        
    }
    
    public overloading(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public overloading(String name, int age,String department)
    {
      this.name=name;
      this.age=age;
      this.department= department ;
      
      
    }
    public overloading(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    
    
    public void displayinfo(){
        System.out.println(name+","+age+","+department);
    }
    
    public void displayinfo(String event)
    {
        System.out.println("event:"+event);
        this.displayinfo();
    }
    
    public void  displayinfo( String event,int fee)
    {
        this.displayinfo();
        System.out.println("Event: " + event + ", Fee: " + fee);
    }
    public void showdetails()
    {
        System.out.println("Student: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args)
    {
        overloading s1 =new overloading();
        
        overloading s2 =new overloading("rafi",21);
        overloading s3 =new overloading("mim",22,"cse");
        overloading s4 =new overloading(23,"sakib");
        
        
        
        s1.displayinfo();
        s2.displayinfo();
        s3.displayinfo("robotucs");
        s4.displayinfo("robotics",500);
        
        s3.showdetails();
        s4.showdetails();
        
        
    }
}

