package tasks;

import managers.TaskStatuses;

public class SubTask extends Task {
    private final int epicId;

    public SubTask(String title, TaskTypes type, String description, TaskStatuses status, int id, int epicId) {
        super(title, type, description, status, id);
        this.epicId = epicId;
    }

    public int getEpicId() {

        return epicId;
    }

    public TaskStatuses getStatus() {

        return status;
    }

    @Override
    public String toString() {

        return super.toString() + epicId;
        //[5] = epicId
    }
}
