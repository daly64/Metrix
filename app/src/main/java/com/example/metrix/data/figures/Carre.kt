package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure
import kotlin.math.pow

class Carre
    (
    var c: Double = 0.0,
    var perimeter: Double = 4 * c,
    var area: Double = c.pow(2),
    var perimeter_parameters: Array<String> = arrayOf("c"),
    var area_parameters: Array<String> = arrayOf("c"),
) : Figure(
    imageID = R.drawable.carre,
    name = FigureName.Carre,
    perimeterFormula = "P = 4c",
    areaFormula = "A = c2",
)

/*
{
    fun perimeter(c: Int) = 4 * c
    fun area(c: Double) = c.pow(2)
}*/
