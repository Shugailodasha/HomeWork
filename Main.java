package kontrol_work;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Mother[] Mother = new Mother[3];
        Mother[0] = new Mother(43,160);
        Mother[1] = new Mother(23,178);
        Mother[2] = new Mother(33,182);
        Mother Test = (Mother[0].MakeDother());
        ((Dother) Test).Sing();
        if (Test instanceof Dother)
        {
            System.out.println("Test is Dother");
        }
        if (Test instanceof Dother)
        {
            System.out.println("Test is Son");
        }
    }
    void Motherage (Object Mother)
    {
        System.out.println(((Mother) Mother).age);
    }
}
class Mother
{
 int age;
 double height;

 public Mother (int age, double height) {
     this.age = age;
     this.height = height;
 }
 Dother MakeDother()
{
    return new Dother(2, 120, false);
}
 Son MakeSon()
 {
   return new Son  (2, 160, true);
 }

     Dother d = new Dother(9,140,true ) ;
     Son s = new Son( 17, 176, false);

}
class Dother extends Mother
{
 boolean isCanSing;
 public Dother (int age, double height, boolean isCanSing){
     super (age, height);
     this.isCanSing = isCanSing;
 }
 void Sing()
 {
     if (isCanSing)
     {
         System.out.println("Sing in her room");
     }
     else
     {
         System.out.println("lerning to sing");
     }

 }
}
class Son extends Mother
{
 boolean isCanSing;
 public Son (int age, double height, boolean isCanSing ){
     super (age, height);
     this.isCanSing = isCanSing;

 }
 void Sing (boolean isCanSing)
 {
   if (isCanSing)
   {
       System.out.println("Sing in his room");
   }
   else
       {
           System.out.println("lerning to sing");
       }
 }
}