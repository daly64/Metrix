package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Rectangle : Figure(
    imageID = R.drawable.rectangle,
    name = FigureName.Rectangle,
    perimeterFormula = "P = 2 (b + h) ",
    areaFormula = "A = b×h",
) {
    fun perimeter(b: Int, h: Int) = 2 * (b + h)
    fun area(b: Int, h: Int) = b * h
}