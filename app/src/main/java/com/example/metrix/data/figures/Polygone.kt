package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

class Polygone
    (
    var a: Double = 0.0,
    var c: Double = 0.0,
    var n: Double = 0.0,
    var perimeter: Double = n * c,
    var area: Double = (c * a * n) / 2,
    var perimeter_parameters: Array<String> = arrayOf("n", "c"),
    var area_parameters: Array<String> = arrayOf("c", "a", "n"),
) : Figure(
    imageID = R.drawable.polygone,
    name = FigureName.Polygone,
    perimeterFormula = "P = n×c",
    areaFormula = "A = c a n / 2",
)/*
{
    fun perimeter(n: Int, c: Int) = n * c
    fun area(a: Int, c: Int, n: Int) = (c * a * n) / 2
}*/
