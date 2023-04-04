package com.weathertalk.weathertalk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeathertalkApplication

fun main(args: Array<String>) {
	runApplication<WeathertalkApplication>(*args)
}
