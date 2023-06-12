package com.example.metrix.data

import com.example.metrix.data.enums.FormeName
import com.example.metrix.data.models.FormeModel
import kotlin.math.PI
import kotlin.math.pow

fun FormeModel.setCote(cote:String, value: Double) {
    cotes[cote]=value
}

fun FormeModel.getPerimeter() {
    perimeterValue = when (formeName) {
        FormeName.Triangle -> cotes["a"]!! + cotes["b"]!! + cotes["c"]!!
        FormeName.Trapeze -> cotes["b"]!! + cotes["a"]!! + cotes["B"]!! + cotes["c"]!!
        FormeName.Rectangle -> 2 * (cotes["b"]!! + cotes["h"]!!)
        FormeName.Polygone -> cotes["n"]!! * cotes["c"]!!
        FormeName.Parallelogramme -> 2 * (cotes["a"]!! + cotes["b"]!!)
        FormeName.Losange -> 4 * cotes["c"]!!
        FormeName.Cercle -> 2 * PI * cotes["r"]!!
        FormeName.Carre -> 4 * cotes["c"]!!
    }
}

fun FormeModel.getArea() {
    areaValue = when (formeName) {
        FormeName.Triangle -> cotes["b"]!! * cotes["h"]!! / 2
        FormeName.Trapeze -> (cotes["b"]!! + cotes["B"]!!) * cotes["h"]!! / 2
        FormeName.Rectangle -> cotes["b"]!! * cotes["h"]!!
        FormeName.Polygone -> (cotes["c"]!! * cotes["a"]!! * cotes["n"]!!) / 2
        FormeName.Parallelogramme -> cotes["b"]!! * cotes["h"]!!
        FormeName.Losange -> (cotes["D"]!! * cotes["d"]!!) / 2
        FormeName.Cercle -> PI * cotes["r"]!!.pow(2)
        FormeName.Carre -> cotes["c"]!!.pow(2)
    }
}
