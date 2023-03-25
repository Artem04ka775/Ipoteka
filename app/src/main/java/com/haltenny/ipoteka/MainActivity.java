package com.haltenny.ipoteka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float telescope = 14000;
    int wallet = 1000;
    float payableSalary = 2500;
    float bankPercent = 5;

    public float calculateMonthsToSaveForTelescope() {
        float savingsGoal = telescope - wallet;
        float monthlyInterestRate = bankPercent / 12;
        int months = 0;

        while (wallet < savingsGoal) {
            wallet += (int) payableSalary;
            wallet = (int) (wallet * (1 + monthlyInterestRate));
            months++;
        }

        return months;
    }

    private TextView monthsToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        monthsToShow = findViewById(R.id.monthsToShow);
        monthsToShow.setText("Ипотека бует выплачиваться " + calculateMonthsToSaveForTelescope() + " месяцев");



    }
}