package de.alixcja

import io.ktor.server.application.*

fun main() {

    connectToPostgresSql()
    createTables()
}

private fun createTables() {
    logger.info { "Creating all necessary tables" }
    transaction {
        SchemaUtils.create(Vehicle)
        logger.info { "Created `vehicle` table " }
        SchemaUtils.create(Mileage)
        logger.info { "Created `mileage` table " }
        SchemaUtils.create(Refuel)
        logger.info { "Created `refuel` table " }
    }
    logger.info { "Created all necessary tables" }
}

private fun connectToPostgresSql() {
    logger.info { "Connecting to PostgresSQL database" }
    Database.connect(
        "jdbc:postgresql://localhost:5432/focify",
        driver = "org.postgresql.Driver",
        user = "postgres",
        password = "postgres"
    )
    logger.info { "Successfully connected to PostgresSQL database" }
}