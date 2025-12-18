package de.alixcja.database.tables

import de.alixcja.database.tables.Vehicle.uniqueIndex
import org.jetbrains.exposed.sql.ReferenceOption
import org.jetbrains.exposed.sql.Table

object Refuel : Table() {
    val id = integer("id").autoIncrement().uniqueIndex()
    // TODO: Implement date of refuel
    //val date = date()
    val litre = double("litre")
    val totalAmount = double("total_amount")
    val pricePerLitre = double("price_per_litre")
    val mileage = optReference("mileage", Mileage.id, onDelete = ReferenceOption.CASCADE)
    val vehicle = optReference("vehicle", Vehicle.id, onDelete =  ReferenceOption.CASCADE)

    override val primaryKey = PrimaryKey(id)
}