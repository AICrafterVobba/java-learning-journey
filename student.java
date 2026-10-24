
package ShakeStation;


public class student {
    String name;
    int age;
    String department;
    
    
    public student()
    {
        
    }
    public student(String name,int age,String department)
    {
        this.name=name;
        this.age=age;
        this.department=department;
    
    }
    
    public student(int age,String name,String department)
    {
        this.name=name;
        this.age=age;
        this.department=department;
    }
    
    public void display()
    {
        System.out.println(name+","+age+","+department);
    }
    public void showDetails()
    {
        System.out.println("student:"+name+","+"age:"+age);
    }
    public void register(String event)
    {
        System.out.println(name+"registered for"+event+","+"fee:0");
    }
    public void register(String event,int fee)
    {
        System.out.println(name+"is already registered for "+event);
    }
    
    
    
    public static void main(String[] args)
    {
        student s1=new student();
        student s2=new student("rafi",21,null);
        student s3=new student("mim",22,"cse");
        student s4= new student(23,"sakib",null);
        
        
        s1.display();
        s2.display();
        s3.display();
        s4.showDetails();
        s3.register("robotics");
        s3.register("programming");
        s3.register("robotics",300);
    }
    
    
    
    
    
    
}
