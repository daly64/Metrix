package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure
import kotlin.math.PI
import kotlin.math.pow

class Cercle(
    var r: Double = 0.0,
    var perimeter: Double = 2 * PI * r,
    var area: Double = PI * r.pow(2),
    var perimeter_parameters: Array<String> = arrayOf("r"),
    var area_parameters: Array<String> = arrayOf("r"),
) : Figure(
    imageID = R.drawable.cercle,
    name = FigureName.Cercle,
    perimeterFormula = "P = 2πr",
    areaFormula = "A = πr2",
)
/*
{
    fun perimeter(r: Double) = 2 * PI * r
    fun area(r: Double) = PI * r.pow(2)
}*/
