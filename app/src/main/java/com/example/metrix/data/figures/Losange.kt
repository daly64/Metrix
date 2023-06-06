package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

class Losange
    (
    var c: Double = 0.0,
    var d: Double = 0.0,
    var D: Double = 0.0,
    var perimeter: Double = 2 * c,
    var area: Double = D * d,
    var perimeter_parameters: Array<String> = arrayOf("c"),
    var area_parameters: Array<String> = arrayOf("d", "D"),
) : Figure(
    imageID = R.drawable.losange,
    name = FigureName.Losange,
    perimeterFormula = "P = 4c",
    areaFormula = "A = D×d/2",
)
/*
{
    fun perimeter(c: Int) = 2 * c
    fun area(D: Int, d: Int) = D * d
}*/
