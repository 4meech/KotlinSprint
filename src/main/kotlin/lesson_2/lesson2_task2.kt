package org.example.lesson_2

fun main() {
    val employeesCount = 50
    val employeeSalary = 30_000
    val traineeCount = 30
    val traineeSalary = 20_000

    val employeeWageFund = employeesCount * employeeSalary
    val totalWageFund = employeeWageFund + (traineeCount * traineeSalary)
//  Если мы считаем стажёров сотрудниками:
    val averageWagePerCapita = totalWageFund / (employeesCount + traineeCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: ${employeeWageFund} руб.")
    println("Общие расходы по ЗП после прихода стажеров: ${totalWageFund} руб.")
    println("Cредняя ЗП одного сотрудника после устройства стажеров: ${averageWagePerCapita} руб.")
}