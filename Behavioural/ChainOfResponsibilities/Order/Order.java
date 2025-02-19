package Behavioural.ChainOfResponsibilities.Order;

import java.time.LocalDate;

public class Order {
    private boolean delivered;
    private OrderStatus status;
    private LocalDate elaboratingDate;
    private LocalDate workingDate;
    private LocalDate completedDate;
    private LocalDate deliveredDate;
    private LocalDate canceledDate;

    public Order() {
        this.delivered = false;
        this.status = OrderStatus.ELABORATING;
        this.elaboratingDate = null;
        this.workingDate = null;
        this.completedDate = null;
        this.deliveredDate = null;
        this.canceledDate = null;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDate getElaboratingDate() {
        return elaboratingDate;
    }

    public void setElaboratingDate(LocalDate elaboratingDate) {
        this.elaboratingDate = elaboratingDate;
    }

    public LocalDate getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(LocalDate workingDate) {
        this.workingDate = workingDate;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public LocalDate getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(LocalDate deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public LocalDate getCanceledDate() {
        return canceledDate;
    }

    public void setCanceledDate(LocalDate canceledDate) {
        this.canceledDate = canceledDate;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("status = ")
                .append(this.status)
                .toString();
    }
}
