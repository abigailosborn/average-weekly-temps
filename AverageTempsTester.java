
/**
 * Tester class to declare TempObjects
 *
 * @author Abigail Osborn
 * @version March 5, 2022
 */
public class AverageTempsTester
{
    // instance variables
    private int sun;
    private int mon;
    private int tues;
    private int wed;
    private int thurs;
    private int fri;
    private int sat;
    private String name;

    // Constructor for objects of class AverageTempTester
    public AverageTempsTester(String name, int sun, int mon, int tues, int wed, int thurs, int fri, int sat){
        // initialize instance variables
        this.name = name;
        this.sun = sun;
        this.mon = mon;
        this.tues = tues;
        this.wed = wed;
        this.thurs = thurs;
        this.fri = fri;
        this.sat = sat;
    }
    //intialize variables
    public int sun(){
        return sun;
    }
    public int mon(){
        return mon;
    }
    public int tues(){
        return tues;
    }
    public int wed(){
        return wed;
    }
    public int thurs(){
        return thurs;
    }
    public int fri(){
        return fri;
    }
    public int sat(){
        return sat;
    }
    
    //Create getter methods
    public int getSun(){
        return sun;
    }
    public int getMon(){
        return mon;
    }
    public int getTues(){
        return tues;
    }
    public int getWed(){
        return wed;
    }
    public int getThurs(){
        return thurs;
    }
    public int getFri(){
        return fri;
    }
    public int getSat(){
        return sat;
    }
    
    //Create Setter methods
    public void setSun(int num){
        sun = num;
    }
    public void setMon(int num){
        mon = num;
    }
    public void setTues(int num){
        tues = num;
    }
    public void setWed(int num)
    {
        wed = num;
    }
    public void setThurs(int num){
        thurs = num;
    }
    public void setFri(int num){
        fri = num;
    }
    public void setSat(int num){
        sat = num;
    }
    
    //Create week variables
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    //Print AverageTempsTester objects
    public String toString(){
        return String.format("%-16s %4d %11d %11d %12d %12d %12d %12d", name, sun, mon, tues, wed, thurs, fri, sat);
    }
}
