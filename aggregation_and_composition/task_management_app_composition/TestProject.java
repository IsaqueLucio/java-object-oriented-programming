package aggregation_and_composition.task_management_app_composition;

public class TestProject {
    public static void main(String[] args) {
        
        Project pro1 = new Project("Online Museum");
        pro1.createSprint(1, "First Screen");
        pro1.createSprint(2, "Second Screen");
        pro1.createSprint(3, "Third Screen");
        System.out.println(pro1);

        pro1 = null;
        
        if(pro1 == null){
            System.out.println("proving that composition is working, cause now the list is null: ");
            //System.out.println(pro1.getSprintList());
        } //Without "else" because it will never fall here, since on line 12 the list was set as null.
        
    }
}
