package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

class Trapeze(
    var a: Double = 0.0,
    var b: Double = 0.0,
    var c: Double = 0.0,
    var B: Double = 0.0,
    var h: Double = 0.0,
    var perimeter: Double = b + a + B + c,
    var area: Double = ((b + B) * h) / 2,
    var perimeter_parameters: Array<String> = arrayOf("a", "b", "c", "B"),
    var area_parameters: Array<String> = arrayOf("b", "B", "h"),
)
    : Figure(
    imageID = R.drawable.trapeze,
    name = FigureName.Trapeze,
    perimeterFormula = "P = b+a+B+c",
    areaFormula = "A = (b+B)×h/2",
)
/*
{
    fun perimeter(a: Int, b: Int, c: Int, B: Int) = b + a + B + c
    fun area(b: Int, B: Int, h: Int) = ((b + B) * h)/ 2
}*/
