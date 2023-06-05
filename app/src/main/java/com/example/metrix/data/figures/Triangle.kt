package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Triangle : Figure(
    imageID = R.drawable.triangle,
    name = FigureName.Triangle,
    perimeterFormula = "P = a+b+c",
    areaFormula = "A = b×h/2",
) {
    fun perimeter(a: Int, b: Int, c: Int) = a + b + c
    fun area(b: Int, h: Int) = (b * h) / 2
}