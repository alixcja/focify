package de.alixcja.database.tables

import org.jetbrains.exposed.sql.ReferenceOption
import org.jetbrains.exposed.sql.Table

object Mileage : Table() {
    val id = integer("id").autoIncrement().uniqueIndex()
    // trackingtime
    val kilometres = double("kilometres")
    val vehicle = optReference("vehicle", Vehicle.id, onDelete = ReferenceOption.CASCADE)

    override val primaryKey = PrimaryKey(id)
}