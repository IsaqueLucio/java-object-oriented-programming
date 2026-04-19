package classesandobjects.simpleacademictaskmanager;

public class Task {

    public String title;
    public int deadlineDays;
    public boolean isCompleted;

    public Task(String title, int deadlineDays) {
        this.title = title;
        this.deadlineDays = deadlineDays;
        this.isCompleted = false;
    }

    public void completeTask(){
        this.isCompleted = true;
        System.out.println("Task "+title+" is complete!");
    }
    
}
