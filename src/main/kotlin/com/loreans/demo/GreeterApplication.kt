package com.loreans.demo

import com.fasterxml.jackson.databind.ObjectMapper
import java.util.*

fun main(args: Array<String>) {
    println("hooray! i am here..")
    println("Used objectmapper as library to generate time: " + ObjectMapper().writeValueAsString(Date()))
}