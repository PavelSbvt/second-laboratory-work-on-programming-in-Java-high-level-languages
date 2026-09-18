package ru.sablin.lab2;


public class BMICalculator {
    public static double calculateBMI(double personWeight, double personHeight){
        return personWeight / (Math.pow(personHeight, 2));
    }

    public static String indexProcessing (double BodyMassIndex){
        if (BodyMassIndex < 18.5){
            return "Недостаточный вес";
        } else if (BodyMassIndex < 25.0){
            return "Норма";
        } else if (BodyMassIndex < 30.0){
            return "Избыточный вес";
        } else {
            return "Ожирение";
        }
    }

    public static String getRecommendationForBMI(double BodyMassIndex){
        if (BodyMassIndex < 18.5){
            return "Для набора веса рекомендуется увеличить калорийность рациона на " +
                    "300–500 ккал в сутки, добавить силовые тренировки и соблюдать " +
                    "режим питания.";
        } else if (BodyMassIndex < 25.0){
            return "Соблюдайте принципы здорового питания: разнообразный рацион с " +
                    "достаточным количеством овощей и фруктов, контроль калорийности.";
        } else if (BodyMassIndex < 30.0){
            return "Для снижения веса рекомендуется создать небольшой дефицит калорий " +
                    "(например, сократить потребление на 500 ккал в сутки) и постепенно " +
                    "увеличивать физическую активность.";
        } else {
            return "ИМТ повышен. Рекомендуем проконсультироваться со специалистом:" +
                    " он поможет составить безопасный план.";
        }
    }
}
