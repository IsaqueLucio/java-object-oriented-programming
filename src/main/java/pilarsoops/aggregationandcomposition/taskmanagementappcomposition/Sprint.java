package aggregationandcomposition.taskmanagementappcomposition;

public class Sprint {
    
    private int sprintNumber;
    private String goal;

    protected Sprint(int sprintNumber, String goal){
        this.sprintNumber = sprintNumber;
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "Sprint [sprintNumber=" + sprintNumber + ", goal=" + goal + "]";
    }

    public int getSprintNumber() {
        return sprintNumber;
    }

    public String getGoal() {
        return goal;
    }

    
}
