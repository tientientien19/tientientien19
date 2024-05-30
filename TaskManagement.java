public class TaskManagement {
    public static void main(String[] args) {
        Task simpletask1 = new SimpleTask("Do 1");
        Task simpletask2 = new SimpleTask("Do 2");
        TaskList taskList = new TaskList("Do");
        taskList.addTask(simpletask1);
        taskList.addTask(simpletask2);
        Task complextask1 = new SimpleTask("Do 3");
        Task complextask2 = new SimpleTask("Do 4");
        TaskList smallTaskList = new TaskList("Do do do");
        smallTaskList.addTask(complextask1);
        smallTaskList.addTask(complextask2);
        taskList.addTask(smallTaskList);
        taskList.display();
    }
}
