package practice2;

public class Main {
    public static void main(String[] args) {
        User u1 = new User (2002, 5, 1, 23);
        User u2 = new User(2003, 7,3,11);
        System.out.println(u1.equals(u2));
    }
}
class User
{
    int ageYear;
    int ageMounth;
    int ageWeek;
    int ageDay;
    public User (int ageYear, int ageMounth, int ageWeek, int ageDay) {
        this.ageYear = ageYear;
        this.ageMounth = ageMounth;
        this.ageWeek = ageWeek;
        this.ageDay = ageDay;
    }
   @Override
   public boolean equals (Object obj) {
        return (((User) obj).ageYear == this.ageYear&&
                ((User)obj).ageMounth == this.ageMounth &&
                ((User)obj).ageWeek == this.ageWeek &&
                ((User)obj).ageDay == this.ageDay);

   }
}
