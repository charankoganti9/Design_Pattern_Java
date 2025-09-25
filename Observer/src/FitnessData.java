import java.util.ArrayList;
import java.util.List;

public class FitnessData implements FitnessDataSubject{

    private int steps;
    private int activeMinutes;
    private int caloriesBurned;

    private final List<FitnessDataObserver> observers = new ArrayList<>();

    public void registerObserver(FitnessDataObserver observer)
    {
        observers.add(observer);
    }

    public void removeObserver(FitnessDataObserver observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers()
    {
        for(FitnessDataObserver observer:observers)
        {
            observer.update(this);
        }
    }

    public void newFitnessDataPushed(int steps,int activeMinutes,int caloriesBurned)
    {
        this.steps = steps;
        this.activeMinutes=activeMinutes;
        this.caloriesBurned = caloriesBurned;

        notifyObservers();
    }

    public void dailyReset()
    {
        this.steps = 0;
        this.activeMinutes = 0;
        this.caloriesBurned = 0;

        notifyObservers();
    }

    public int getSteps() {
        return steps;
    }

    public int getActiveMinutes() {
        return activeMinutes;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
