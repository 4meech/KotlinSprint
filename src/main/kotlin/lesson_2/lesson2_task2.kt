package org.example.lesson_2

fun main() {
    val EMPLOYEES_COUNT = 50
    val EMPLOYEE_INCOME_PER_CAPITA = 30_000
    val TRAINEE_COUNT = 30
    val TRAINEE_INCOME_PER_CAPITA = 20_000

    val employeeWageFund = EMPLOYEES_COUNT * EMPLOYEE_INCOME_PER_CAPITA
    val totalWageFund = employeeWageFund + (TRAINEE_COUNT * TRAINEE_INCOME_PER_CAPITA)
//  Если мы считаем стажёров сотрудниками:
    val averageWagePerCapita = totalWageFund / (EMPLOYEES_COUNT + TRAINEE_COUNT)

    println("Расходы на выплату зарплаты постоянных сотрудников: ${employeeWageFund} руб.")
    println("Общие расходы по ЗП после прихода стажеров: ${totalWageFund} руб.")
    println("Cредняя ЗП одного сотрудника после устройства стажеров: ${averageWagePerCapita} руб.")
}