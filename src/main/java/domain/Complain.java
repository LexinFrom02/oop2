package domain;

public class Complain {
    private boolean complained;
    private String reason;

    public boolean isComplained() {
        return complained;
    }

    public void setComplained(boolean complained) {
        this.complained = complained;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
