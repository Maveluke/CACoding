package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }
    @Override
    public void prepareSuccessClear(ClearOutputData clearOutputData) {
        ClearState currentState = clearViewModel.getState();
        currentState.setMessage(clearOutputData.getMessage());
        clearViewModel.setState(currentState);
    }
}
