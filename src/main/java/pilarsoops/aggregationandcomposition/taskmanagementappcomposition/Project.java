package aggregationandcomposition.taskmanagementappcomposition;

import java.util.ArrayList;
import java.util.List;

public class Project {
    
    private String projectName;
    private List <Sprint> sprintList = new ArrayList<>();

    public Project(String projecName){
        this.projectName = projecName;
    }

    @Override
    public String toString() {
        return "Project [projectName=" + projectName + ", sprintList=" + sprintList + "]";
    }

    public void createSprint(int num, String name){
        Sprint newSprint = new Sprint(num, name);
        this.sprintList.add(newSprint);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Sprint> getSprintList() {
        return sprintList;
    }

    public void setSprintList(List<Sprint> sprintList) {
        this.sprintList = sprintList;
    }

    
}
