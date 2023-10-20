package interface_adapter.clear_users;

public class ClearState {
    private String message = "";
    public ClearState(){}
    public ClearState(ClearState copy){
        this.message = copy.message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
