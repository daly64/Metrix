package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure
import kotlin.math.PI
import kotlin.math.pow

object Cercle : Figure(
    imageID = R.drawable.cercle,
    name = FigureName.Cercle,
    perimeterFormula = "P = 2πr",
    areaFormula = "A = πr2",
) {
    fun perimeter(r: Double) = 2 * PI * r
    fun area(r: Double) = PI * r.pow(2)
}