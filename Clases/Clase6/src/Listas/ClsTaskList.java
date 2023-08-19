package Listas;

public class ClsTaskList {
     private String taskName;

     private String TaskDescription;

     private boolean isDone;

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        TaskDescription = taskDescription;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
