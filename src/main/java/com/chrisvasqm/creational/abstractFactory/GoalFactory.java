package com.chrisvasqm.creational.abstractFactory;

public interface GoalFactory {
    WorkoutPlan createWorkoutPlan();
    MealPlan createMealPlan();
}
