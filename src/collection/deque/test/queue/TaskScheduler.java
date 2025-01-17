package collection.deque.test.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {

    private Queue<Task> tasks = new LinkedList<>();

    public int getRemainingTasks() {
        return tasks.size();
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }

    public void addTask(Task task) {
        tasks.offer(task);
    }
}
