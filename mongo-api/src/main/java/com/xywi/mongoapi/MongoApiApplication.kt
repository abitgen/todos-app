package com.xywi.mongoapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object MongoApiApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(MongoApiApplication::class.java, *args)
    }

}
