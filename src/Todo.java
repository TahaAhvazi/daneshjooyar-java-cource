public class Todo {
    // The required attributes
    private final String description;
    private boolean isCompleted;
    //Our constructor
    public Todo(String description){
        this.description = description;
        this.isCompleted = false;
    }
    // Our needed functions for tasks
    public String getDescription(){
        return description;
    }
    public boolean isCompleted(){
        return isCompleted;
    }
    public void markAsCompleted(){
        isCompleted = true;
    }
}
