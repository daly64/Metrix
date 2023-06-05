package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure
import kotlin.math.pow

object Carre : Figure(
    imageID = R.drawable.carre,
    name = FigureName.Carre,
    perimeterFormula = "P = 4c",
    areaFormula = "A = c2",
) {
    fun perimeter(c: Int) = 4 * c
    fun area(c: Double) = c.pow(2)
}