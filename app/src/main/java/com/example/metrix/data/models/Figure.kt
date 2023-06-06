package com.example.metrix.data.models

import androidx.annotation.DrawableRes
import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import kotlin.math.PI
import kotlin.math.pow


@DrawableRes
fun getImageID(figureName: FigureName): Int =
    when (figureName.name) {
        FigureName.Triangle.name -> R.drawable.triangle
        FigureName.Trapeze.name -> R.drawable.trapeze
        FigureName.Rectangle.name -> R.drawable.rectangle
        FigureName.Polygone.name -> R.drawable.polygone
        FigureName.Parallelogramme.name -> R.drawable.parallelogramme
        FigureName.Losange.name -> R.drawable.losange
        FigureName.Cercle.name -> R.drawable.cercle
        FigureName.Carre.name -> R.drawable.carre
        else -> 0
    }

fun getPerimeterFormula(figureName: FigureName): String =
    when (figureName.name) {
        FigureName.Triangle.name -> "P = a+b+c"
        FigureName.Trapeze.name -> "P = b+a+B+c"
        FigureName.Rectangle.name -> "P = 2 (b + h)"
        FigureName.Polygone.name -> "P = n×c"
        FigureName.Parallelogramme.name -> "P = 2(a + b)"
        FigureName.Losange.name -> "P = 4c"
        FigureName.Cercle.name -> "P = 2πr"
        FigureName.Carre.name -> "P = 4c"
        else -> ""
    }

fun getAreaFormula(figureName: FigureName): String =
    when (figureName.name) {
        FigureName.Triangle.name -> "A = b×h/2"
        FigureName.Trapeze.name -> "A = (b+B)×h/2"
        FigureName.Rectangle.name -> "A = b×h"
        FigureName.Polygone.name -> "A = c a n / 2"
        FigureName.Parallelogramme.name -> "A = b×h"
        FigureName.Losange.name -> "A = D×d/2"
        FigureName.Cercle.name -> "A = πr2"
        FigureName.Carre.name -> "A = c2"
        else -> ""
    }

fun getCotes(figureName: FigureName): Map<String, Double> =
    when (figureName.name) {
        FigureName.Triangle.name -> mapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "h" to 0.0)
        FigureName.Trapeze.name -> mapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "B" to 0.0, "h" to 0.0)
        FigureName.Rectangle.name -> mapOf("b" to 0.0, "h" to 0.0)
        FigureName.Polygone.name -> mapOf("a" to 0.0, "c" to 0.0, "n" to 0.0)
        FigureName.Parallelogramme.name -> mapOf("a" to 0.0, "b" to 0.0, "h" to 0.0)
        FigureName.Losange.name -> mapOf("c" to 0.0, "d" to 0.0, "D" to 0.0)
        FigureName.Cercle.name -> mapOf("r" to 0.0)
        FigureName.Carre.name -> mapOf("c" to 0.0)
        else -> mapOf()
    }

fun getPerimeter(figureName: FigureName, cotes: Map<String, Double>): Double =
    when (figureName.name) {
        FigureName.Triangle.name -> cotes["a"]!! + cotes["b"]!! + cotes["c"]!!
        FigureName.Trapeze.name -> cotes["b"]!! + cotes["a"]!! + cotes["B"]!! + cotes["c"]!!
        FigureName.Rectangle.name -> 2 * (cotes["b"]!! + cotes["h"]!!)
        FigureName.Polygone.name -> cotes["n"]!! * cotes["c"]!!
        FigureName.Parallelogramme.name -> 2 * (cotes["a"]!! + cotes["b"]!!)
        FigureName.Losange.name -> 4 * cotes["c"]!!
        FigureName.Cercle.name -> 2 * PI * cotes["r"]!!
        FigureName.Carre.name -> 4 * cotes["c"]!!
        else -> 0.0
    }

fun getArea(figureName: FigureName, cotes: Map<String, Double>): Double =
    when (figureName.name) {
        FigureName.Triangle.name -> cotes["b"]!! * cotes["h"]!! / 2
        FigureName.Trapeze.name -> (cotes["b"]!! + cotes["B"]!!) * cotes["h"]!! / 2
        FigureName.Rectangle.name -> cotes["b"]!! * cotes["h"]!!
        FigureName.Polygone.name -> (cotes["c"]!! * cotes["a"]!! * cotes["n"]!!) / 2
        FigureName.Parallelogramme.name -> cotes["b"]!! * cotes["h"]!!
        FigureName.Losange.name -> (cotes["D"]!! * cotes["d"]!!) / 2
        FigureName.Cercle.name -> PI * cotes["r"]!!.pow(2)
        FigureName.Carre.name -> cotes["c"]!!.pow(2)
        else -> 0.0
    }

fun getPerimeterCotes(figureName: FigureName): Array<String> =
    when (figureName.name) {
        FigureName.Triangle.name -> arrayOf("a", "b", "c")
        FigureName.Trapeze.name -> arrayOf("a", "b", "c", "B")
        FigureName.Rectangle.name -> arrayOf("b", "h")
        FigureName.Polygone.name -> arrayOf("n", "c")
        FigureName.Parallelogramme.name -> arrayOf("a", "b")
        FigureName.Losange.name -> arrayOf("c")
        FigureName.Cercle.name -> arrayOf("r")
        FigureName.Carre.name -> arrayOf("c")
        else -> arrayOf()
    }

fun getAreaCotes(figureName: FigureName): Array<String> =
    when (figureName.name) {
        FigureName.Triangle.name -> arrayOf("b", "h")
        FigureName.Trapeze.name -> arrayOf("b", "B", "h")
        FigureName.Rectangle.name -> arrayOf("b", "h")
        FigureName.Polygone.name -> arrayOf("c", "a", "n")
        FigureName.Parallelogramme.name -> arrayOf("b", "h")
        FigureName.Losange.name -> arrayOf("d", "D")
        FigureName.Cercle.name -> arrayOf("r")
        FigureName.Carre.name -> arrayOf("c")
        else -> arrayOf()
    }


class Figure(
    var name: FigureName,
    @DrawableRes var imageID: Int = getImageID(name),
    var perimeterFormula: String = getPerimeterFormula(name),
    var areaFormula: String = getAreaFormula(name),
    var cotes: Map<String, Double> = getCotes(name),
    var perimeter: Double = getPerimeter(name, cotes),
    var area: Double = getArea(name, cotes),
    var perimeterCotes: Array<String> = getPerimeterCotes(name),
    var areaCotes: Array<String> = getAreaCotes(name),
)

