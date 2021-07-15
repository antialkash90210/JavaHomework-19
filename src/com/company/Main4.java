package com.company;

public class Main4 {
    public static void getbiggest(int a, int b){
        if(a>b){
            System.out.println("в первом числе сумма чисел больше");
        }
        else{
            System.out.println("во втором числе сумма чисел больше");
        }
    }
    public static int sumdigit(int digit) {
        int sum = 0;
        while(digit != 0){
            //Суммирование цифр числа
            sum += (digit % 10);
            digit/=10;
        }
        return sum;
    }
    public static void main(String[] args) {

        getbiggest(sumdigit(72),sumdigit(91));
    }
}
