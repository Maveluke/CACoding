package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class ClearViewModel extends ViewModel{
    private ClearState clearState = new ClearState();
    public ClearViewModel() {
        super("clear");
    }
    public ClearState getState() {
        return clearState;
    }

    public void setState(ClearState clearState) {
        this.clearState = clearState;
    }
    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
