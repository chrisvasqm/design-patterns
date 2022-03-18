package com.chrisvasqm.exercises_part3.abstractFactory;

public interface GoalFactory {
    WorkoutPlan createWorkoutPlan();
    MealPlan createMealPlan();
}
