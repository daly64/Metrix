package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

class Parallelogramme
    (
    var a: Double = 0.0,
    var b: Double = 0.0,
    var h: Double = 0.0,
    var perimeter: Double = 2 * (a + b),
    var area: Double = b * h,
    var perimeter_parameters: Array<String> = arrayOf("a", "b"),
    var area_parameters: Array<String> = arrayOf("b", "h"),
)

    : Figure(
    imageID = R.drawable.parallelogramme,
    name = FigureName.Parallelogramme,
    perimeterFormula = "P = 2(a + b)",
    areaFormula = "A = b×h",
)
/*
{
    fun perimeter(a: Int, b: Int) = 2 * (a + b)
    fun area(b: Int, h: Int) = b * h
}*/
