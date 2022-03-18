package com.chrisvasqm.exercises_part3.abstractFactory;

public class WeightLossFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new WeighLossMealPlan();
    }
}
