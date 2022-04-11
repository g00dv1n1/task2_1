fun main() {
    val amount = 1200000
    var commission: Double
    val minComm = 3500.0

    commission = amount / 100 * 0.75
    if (commission < minComm) commission = minComm
    println("Комиссия составит:" + commission + "копеек")
    println()
}