package com.example.metrix.data.models

import androidx.annotation.DrawableRes
import com.example.metrix.R
import com.example.metrix.data.enums.FormeName
import kotlin.math.PI
import kotlin.math.pow


@DrawableRes
fun getImageID(formeName: FormeName): Int =
    when (formeName.name) {
        FormeName.Triangle.name -> R.drawable.triangle
        FormeName.Trapeze.name -> R.drawable.trapeze
        FormeName.Rectangle.name -> R.drawable.rectangle
        FormeName.Polygone.name -> R.drawable.polygone
        FormeName.Parallelogramme.name -> R.drawable.parallelogramme
        FormeName.Losange.name -> R.drawable.losange
        FormeName.Cercle.name -> R.drawable.cercle
        FormeName.Carre.name -> R.drawable.carre
        else -> 0
    }

fun getPerimeterFormula(formeName: FormeName): String =
    when (formeName.name) {
        FormeName.Triangle.name -> "P = a+b+c"
        FormeName.Trapeze.name -> "P = b+a+B+c"
        FormeName.Rectangle.name -> "P = 2 (b + h)"
        FormeName.Polygone.name -> "P = n×c"
        FormeName.Parallelogramme.name -> "P = 2(a + b)"
        FormeName.Losange.name -> "P = 4c"
        FormeName.Cercle.name -> "P = 2πr"
        FormeName.Carre.name -> "P = 4c"
        else -> ""
    }

fun getAreaFormula(formeName: FormeName): String =
    when (formeName.name) {
        FormeName.Triangle.name -> "A = b×h/2"
        FormeName.Trapeze.name -> "A = (b+B)×h/2"
        FormeName.Rectangle.name -> "A = b×h"
        FormeName.Polygone.name -> "A = c a n / 2"
        FormeName.Parallelogramme.name -> "A = b×h"
        FormeName.Losange.name -> "A = D×d/2"
        FormeName.Cercle.name -> "A = πr2"
        FormeName.Carre.name -> "A = c2"
        else -> ""
    }

fun getCotes(formeName: FormeName): Map<String, Double> =
    when (formeName.name) {
        FormeName.Triangle.name -> mapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "h" to 0.0)
        FormeName.Trapeze.name -> mapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "B" to 0.0, "h" to 0.0)
        FormeName.Rectangle.name -> mapOf("b" to 0.0, "h" to 0.0)
        FormeName.Polygone.name -> mapOf("a" to 0.0, "c" to 0.0, "n" to 0.0)
        FormeName.Parallelogramme.name -> mapOf("a" to 0.0, "b" to 0.0, "h" to 0.0)
        FormeName.Losange.name -> mapOf("c" to 0.0, "d" to 0.0, "D" to 0.0)
        FormeName.Cercle.name -> mapOf("r" to 0.0)
        FormeName.Carre.name -> mapOf("c" to 0.0)
        else -> mapOf()
    }

fun getPerimeter(formeName: FormeName, cotes: Map<String, Double>): Double =
    when (formeName.name) {
        FormeName.Triangle.name -> cotes["a"]!! + cotes["b"]!! + cotes["c"]!!
        FormeName.Trapeze.name -> cotes["b"]!! + cotes["a"]!! + cotes["B"]!! + cotes["c"]!!
        FormeName.Rectangle.name -> 2 * (cotes["b"]!! + cotes["h"]!!)
        FormeName.Polygone.name -> cotes["n"]!! * cotes["c"]!!
        FormeName.Parallelogramme.name -> 2 * (cotes["a"]!! + cotes["b"]!!)
        FormeName.Losange.name -> 4 * cotes["c"]!!
        FormeName.Cercle.name -> 2 * PI * cotes["r"]!!
        FormeName.Carre.name -> 4 * cotes["c"]!!
        else -> 0.0
    }

fun getArea(formeName: FormeName, cotes: Map<String, Double>): Double =
    when (formeName.name) {
        FormeName.Triangle.name -> cotes["b"]!! * cotes["h"]!! / 2
        FormeName.Trapeze.name -> (cotes["b"]!! + cotes["B"]!!) * cotes["h"]!! / 2
        FormeName.Rectangle.name -> cotes["b"]!! * cotes["h"]!!
        FormeName.Polygone.name -> (cotes["c"]!! * cotes["a"]!! * cotes["n"]!!) / 2
        FormeName.Parallelogramme.name -> cotes["b"]!! * cotes["h"]!!
        FormeName.Losange.name -> (cotes["D"]!! * cotes["d"]!!) / 2
        FormeName.Cercle.name -> PI * cotes["r"]!!.pow(2)
        FormeName.Carre.name -> cotes["c"]!!.pow(2)
        else -> 0.0
    }

fun getPerimeterCotes(formeName: FormeName): Array<String> =
    when (formeName.name) {
        FormeName.Triangle.name -> arrayOf("a", "b", "c")
        FormeName.Trapeze.name -> arrayOf("a", "b", "c", "B")
        FormeName.Rectangle.name -> arrayOf("b", "h")
        FormeName.Polygone.name -> arrayOf("n", "c")
        FormeName.Parallelogramme.name -> arrayOf("a", "b")
        FormeName.Losange.name -> arrayOf("c")
        FormeName.Cercle.name -> arrayOf("r")
        FormeName.Carre.name -> arrayOf("c")
        else -> arrayOf()
    }

fun getAreaCotes(formeName: FormeName): Array<String> =
    when (formeName.name) {
        FormeName.Triangle.name -> arrayOf("b", "h")
        FormeName.Trapeze.name -> arrayOf("b", "B", "h")
        FormeName.Rectangle.name -> arrayOf("b", "h")
        FormeName.Polygone.name -> arrayOf("c", "a", "n")
        FormeName.Parallelogramme.name -> arrayOf("b", "h")
        FormeName.Losange.name -> arrayOf("d", "D")
        FormeName.Cercle.name -> arrayOf("r")
        FormeName.Carre.name -> arrayOf("c")
        else -> arrayOf()
    }


class FormeModel(
    var name: FormeName,
    @DrawableRes var imageID: Int = getImageID(name),
    var perimeterFormula: String = getPerimeterFormula(name),
    var areaFormula: String = getAreaFormula(name),
    var cotes: Map<String, Double> = getCotes(name),
    var perimeter: Double = getPerimeter(name, cotes),
    var area: Double = getArea(name, cotes),
    var perimeterCotes: Array<String> = getPerimeterCotes(name),
    var areaCotes: Array<String> = getAreaCotes(name),
)

