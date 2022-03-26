package maltep.edu.tr.oop;

public class Student extends Person{

    private String Name;
    private String department;
    private int ID;
    private String Rol;




    public Student(int ID,String Rol,String Name,String department) {
        this.department=department;
        this.Name=Name;
        this.ID=ID;
        this.Rol=Rol;


    }
    public int getID(){
        return ID;
    }
    public String getRol(){
        return Rol;}

    public String getName() {
        return Name;}

    public String giveBack(String Rol, String name,String bookName){
        return getRol()+" "+ getName()+" want to give back the book name= "+bookName;}
    public String notAv(String Rol, String name,String bookName){
       return getRol()+" "+ getName()+" sory this book= "+bookName+" not avaliable now";




    }






    private String getdepartment() {
        return department;
    }



    public String welcome(){
        return "\nWelcome to the system " +getName()+ " this is your number  : "+getdepartment();
    }
    public String printString() {
        return "StudentName="+getName()+ "  number:"+getdepartment();

    }





}

