package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

class Triangle(
    var a: Double = 0.0,
    var b: Double = 0.0,
    var c: Double = 0.0,
    var h: Double = 0.0,
    var perimeter: Double = a + b + c,
    var area: Double = (b * h) / 2,
    var perimeter_parameters: Array<String> = arrayOf("a", "b", "c"),
    var area_parameters: Array<String> = arrayOf("b", "h"),
    )
    : Figure(
    imageID = R.drawable.triangle,
    name = FigureName.Triangle,
    perimeterFormula = "P = a+b+c",
    areaFormula = "A = b×h/2",
)
/*
{
    fun perimeter(a: Int, b: Int, c: Int) = a + b + c
    fun area(b: Int, h: Int) = (b * h) / 2
}*/
