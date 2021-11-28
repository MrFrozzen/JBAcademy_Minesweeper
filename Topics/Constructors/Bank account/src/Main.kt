class BankAccount(var deposited: Long, var withdrawn: Long) {
    val balance: Long = deposited - withdrawn
}