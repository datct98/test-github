package lab3.entities;

import java.time.LocalDate;

public class History {
    private Worker worker;
    private double newSalary;
    private String status;
    private LocalDate updated;

    public History(Worker worker, String status, double newSalary) {
        this.worker = worker;
        this.status = status;
        this.updated = LocalDate.now();
        this.newSalary=newSalary;
    }

    @Override
    public String toString() {
        return "History{" +
                "workerID=" + worker.getId()+" - name: "+worker.getName()+" - salary"+newSalary +
                ", status='" + status + '\'' +
                ", updated=" + updated +
                '}';
    }
}
