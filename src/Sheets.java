public class Sheets {
    int students;
    int labs;
    public Sheets(int students,int labs){
        this.students=students;
        this.labs=labs;
    }
    public int totalSheets(){
        return (labs*50)*students;
    }
    public int totalPackets(){
       return (totalSheets()+499)/500;
    }
}
