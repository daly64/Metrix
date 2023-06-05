package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Polygone : Figure(
    imageID = R.drawable.polygone,
    name = FigureName.Polygone,
    perimeterFormula = "P = n×c",
    areaFormula = "A = c a n / 2",
) {
    fun perimeter(n: Int, c: Int) = n * c
    fun area(a: Int, c: Int, n: Int) = (c * a * n) / 2
}