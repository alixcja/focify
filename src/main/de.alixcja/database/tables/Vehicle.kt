package de.alixcja.database.tables

import org.jetbrains.exposed.sql.Table

private const val MAX_75 = 75

private const val MAX_VALUE = 10485760

object Vehicle : Table() {
    val id = integer("id").autoIncrement().uniqueIndex()
    // TODO: Implement Enum for this
    val brand = varchar("brand", MAX_VALUE)
    // TODO: Implement Enum for this
    val model = varchar("model", MAX_VALUE)
    val name = varchar("name", MAX_75).nullable()
    val licensePlate = varchar("license_plate", MAX_75).nullable()
    val vin = varchar("vin", MAX_VALUE)

    override val primaryKey = PrimaryKey(id)
}