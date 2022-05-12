package com.brandjunhoe

import org.springframework.boot.runApplication

//@SpringBootApplication
//(exclude = [DataSourceAutoConfiguration::class])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
