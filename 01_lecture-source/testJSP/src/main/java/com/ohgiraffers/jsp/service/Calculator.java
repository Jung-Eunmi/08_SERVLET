package com.ohgiraffers.jsp.service;

public class Calculator {

    public int calcTotalNum(int firstNum, int secondNum, String operator) {
        int totalNum = 0;

        switch (operator){
            case "+" :
                totalNum = firstNum + secondNum; break;
            case "-" :
                totalNum = firstNum - secondNum; break;
            case "*" :
                totalNum = firstNum * secondNum; break;
            case "/" :
                totalNum = firstNum / secondNum; break;
        }

        return totalNum;
    }
}