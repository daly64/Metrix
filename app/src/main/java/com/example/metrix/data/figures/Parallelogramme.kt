package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Parallelogramme : Figure(
    imageID = R.drawable.parallelogramme,
    name = FigureName.Parallelogramme,
    perimeterFormula = "P = 2(a + b)",
    areaFormula = "A = b×h",
) {
    fun perimeter(a: Int, b: Int) = 2 * (a + b)
    fun area(b: Int, h: Int) = b * h
}