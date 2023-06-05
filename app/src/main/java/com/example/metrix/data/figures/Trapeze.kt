package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Trapeze : Figure(
    imageID = R.drawable.trapeze,
    name = FigureName.Trapeze,
    perimeterFormula = "P = b+a+B+c",
    areaFormula = "A = (b+B)×h/2",
) {
    fun perimeter(a: Int, b: Int, c: Int, B: Int) = b + a + B + c
    fun area(b: Int, B: Int, h: Int) = ((b + B) * h)/ 2
}