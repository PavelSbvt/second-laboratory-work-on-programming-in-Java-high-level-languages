package ru.sablin.lab2;

import javax.swing.*;
import javax.swing.BorderFactory;


public class BMI {
    private JPanel contentPane;
    private JLabel labelDecodingBMILabel;
    private JTextField fieldWeightTextField;
    private JLabel showFormulaLabel;
    private JLabel labelWeight;
    private JLabel heightLabel;
    private JLabel labelTitle;
    private JTextField heightTextField;
    private JLabel labelCapTabel1Col;
    private JLabel labelCapTabel2Col;
    private JPanel imaginaryTabel;
    private JLabel labelTabelFirstColSecondRow;
    private JLabel labelTabelSecondColSecondRow;
    private JLabel labelTabelFirstColThirtRow;
    private JLabel labelTabelSecondColThirtRow;
    private JLabel labelTabelFirstColFourthRow;
    private JLabel labelTabelSecondColFourthRow;
    private JPanel capTablePanel;
    private JPanel inputValuesPanel;
    private JPanel forFormulaPanel;
    private JPanel mainTitlePanel;
    private JLabel labelTableFirstColFifthsRow;
    private JLabel labelTableSecondColFifthsRow;
    private JButton buttonForRun;
    private JLabel resultTitleLabel;

    private JPanel resultsAndInterpritePanel;

    private JPanel forLabelsTitlesResultsPanel;

    private JLabel interpritetionTitleLabel;
    private JLabel BMITitleLabel;
    private JLabel recomendationTitleLabel;

    private JLabel BMIShowResultLabel;
    private JLabel InterpritationShowResultLabel;
    private JLabel recomendationShowResultLabel;


    public BMI() {
        fieldWeightTextField.setOpaque(true);
        fieldWeightTextField.setBorder(null);
        heightTextField.setBorder(null);
        heightTextField.setOpaque(true);

        labelDecodingBMILabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 15, 20));
        labelDecodingBMILabel.setText(
                "<html>BMI (Body Mass Index) расшифровывается как индекс массы тела" +
                        " (ИМТ) — это показатель, который оценивает соответствие веса " +
                        "и роста человека.</html>"
        );

        mainTitlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        inputValuesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        showFormulaLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelWeight.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        heightLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelCapTabel1Col.setBorder(BorderFactory.createEmptyBorder(10, 20, 15, 20));
        labelCapTabel2Col.setBorder(BorderFactory.createEmptyBorder(10, 20, 15, 20));

        labelTabelFirstColSecondRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTabelSecondColSecondRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTabelFirstColThirtRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTabelSecondColThirtRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTabelFirstColFourthRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTabelSecondColFourthRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTableFirstColFifthsRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        labelTableSecondColFifthsRow.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        resultTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 15, 20));

        BMITitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        recomendationTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        interpritetionTitleLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        BMIShowResultLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        recomendationShowResultLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        InterpritationShowResultLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        buttonForRun.addActionListener(eventClickOnButtonRun -> {
            String weightText = fieldWeightTextField.getText().trim();
            String heightText = heightTextField.getText().trim();

            if (weightText.isEmpty() || heightText.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Заполните оба поля!");
                return;
            }

            try {
                double weight = Double.parseDouble(weightText);
                double height = Double.parseDouble(heightText);

                if (weight <= 0 || height <= 0) {
                    JOptionPane.showMessageDialog(null, "Введите положительные числа!");
                    return;
                }

                double bmi = BMICalculator.calculateBMI(weight, height);
                String interpret = BMICalculator.indexProcessing(bmi);
                String recommend = BMICalculator.getRecommendationForBMI(bmi);

                System.out.println("[Debug] weight = " + weight);
                System.out.println("[Debug] height = " + height);
                System.out.println("[Debug] bmi = " + bmi);
                System.out.println("[Debug] interpret = " + interpret);

                BMIShowResultLabel.setText(String.format("%.2f", bmi));
                InterpritationShowResultLabel.setText(interpret);
                recomendationShowResultLabel.setText(String.format("<html>%s</html>", recommend));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка: введите числа!");
            }
        });
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
