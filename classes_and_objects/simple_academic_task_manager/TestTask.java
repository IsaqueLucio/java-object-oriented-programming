package classes_and_objects.simple_academic_task_manager;

public class TestTask{
    public static void main(String[] args) {
        Task task1 = new Task("Studying Java", 10);
        Task task2 = new Task("Submitting Network Assignment", 10);
        Task task3 = new Task("Enrolling in Courses", 7);

        task1.completeTask();
        task3.completeTask();
        task2.completeTask();
    }
}