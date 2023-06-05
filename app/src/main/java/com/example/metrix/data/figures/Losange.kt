package com.example.metrix.data.figures

import com.example.metrix.R
import com.example.metrix.data.enums.FigureName
import com.example.metrix.data.models.Figure

object Losange : Figure(
    imageID = R.drawable.losange,
    name = FigureName.Losange,
    perimeterFormula = "P = 4c",
    areaFormula = "A = D×d/2",
) {
    fun perimeter(c: Int) = 2 * c
    fun area(D: Int, d: Int) = D * d
}