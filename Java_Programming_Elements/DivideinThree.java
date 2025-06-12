public class DivideinThree {    
    public static void main(String[] args){
        int NumberOfPen = 14;
        int NumberOfStudents = 3;
        int penperStudent = NumberOfPen / NumberOfStudents;
        int remainingPens = NumberOfPen % NumberOfStudents;
        System.out.println("Each student will get " + penperStudent + " pens."); 
        System.out.println("Remaining pens after distribution: " + remainingPens);  
    }
    
}
