package com.example.crimeapp

import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(), //жавовский класс для генерации рандомного и уникального айдишника
    var title: String = "",
    var date:Date= Date(),
    var isSolved:Boolean=false
    )