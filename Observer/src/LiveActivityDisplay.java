public class LiveActivityDisplay implements FitnessDataObserver{

    public void update(FitnessData data)
    {
        System.out.println("Live Display → Steps: " + data.getSteps() +
                " | Active Minutes: " + data.getActiveMinutes() +
                " | Calories: " + data.getCaloriesBurned());
    }
}
