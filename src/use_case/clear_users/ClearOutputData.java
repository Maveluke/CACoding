package use_case.clear_users;

public class ClearOutputData {
    private final String message;

    public ClearOutputData(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
