package zad2;

public class StringTask implements Runnable{
    public StringTask(String str, int i){

    }
    public void start(){
        
    }
    public void abort(){
        
    }
    public boolean isDone() {

    }

    @Override
    public void run() {
        
    }

    public String getResult() {
    }

    enum state {RUNNING,ABORTED,READY}
    public state getState() {

        return state.RUNNING;
        return state.ABORTED;
        return state.READY;
    }
}
