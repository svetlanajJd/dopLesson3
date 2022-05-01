public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 6.условные операторы");
        int age = 19;
        int salary = 58_000;
        int creditLimit = 0;


        if (age >= 23) {
            if (salary >= 50_000 && salary < 80_000) {
                creditLimit = (int) ((salary * 3) * 1.2);
            } else {
                if (salary >= 80_000) {
                    creditLimit = (int) ((salary * 3) * 1.5);
                } else {
                    if (salary < 50_000) {
                        creditLimit = (salary * 3);
                    }
                }
            }
        } else {
            if (salary >= 50_000 && salary < 80_000) {
                creditLimit = (int) ((salary * 2) * 1.2);
            } else {
                if (salary >= 80_000) {
                    creditLimit = (int) ((salary * 2) * 1.5);
                } else {
                    if (salary < 50_000) {
                        creditLimit = (salary * 2);
                    }
                }
            }
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");

        System.out.println("Задача 7.условные операторы");
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        int sumMonth = wantedSum / 12;
        double creditRate = (wantedSum / 100) * 10;
        double creditRateMonth;
        int max = salary / 2;
        if (salary < 80_000 && age < 23) {
            creditRate = creditRate + (wantedSum / 100);
        } else if (salary < 80_000 && age >= 23 && age < 30) {
            creditRate = creditRate + (wantedSum / 100) * 0.5;
        } else if (salary > 80_000) {
            creditRate = creditRate - (wantedSum / 100) * 0.7;
        }
        creditRateMonth = creditRate / 12;
        if (max > creditRateMonth + sumMonth) {
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + max + " рублeй. Платеж ро кредиту " + (creditRateMonth + sumMonth) + " рублей. Одобрено");
        } else {
            System.out.println("Максимальный платеж при зарплате " + salary + " равен " + max + " рублeй. Платеж ро кредиту " + (creditRateMonth + sumMonth) + " рублей. Не одобрено");
        }
    }
}

