package com.example.metrix.data.models

import com.example.metrix.R

fun defTriangle(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.triangle
        perimeterFormula = "P = a+b+c"
        areaFormula = "A = b×h/2"
        perimeterCotes = arrayOf("a", "b", "c")
        areaCotes = arrayOf("b", "h")
        cotes = mutableMapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "h" to 0.0)
    }
}

fun defTrapeze(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.trapeze
        perimeterFormula = "P = b+a+B+c"
        areaFormula = "A = (b+B)×h/2"
        perimeterCotes = arrayOf("a", "b", "c", "B")
        areaCotes = arrayOf("b", "B", "h")
        cotes = mutableMapOf("a" to 0.0, "b" to 0.0, "c" to 0.0, "B" to 0.0, "h" to 0.0)
    }
}

fun defRectangle(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.rectangle
        perimeterFormula = "P = 2 (b + h)"
        areaFormula = "A = b×h"
        perimeterCotes = arrayOf("b", "h")
        areaCotes = arrayOf("b", "h")
        cotes = mutableMapOf("b" to 0.0, "h" to 0.0)
    }
}

fun defPolygone(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.polygone
        perimeterFormula = "P = n×c"
        areaFormula = "A = c a n / 2"
        perimeterCotes = arrayOf("n", "c")
        areaCotes = arrayOf("c", "a", "n")
        cotes = mutableMapOf("a" to 0.0, "n" to 0.0, "c" to 0.0)
    }
}

fun defParallelogramme(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.parallelogramme
        perimeterFormula = "P = 2(a + b)"
        areaFormula = "A = b×h"
        perimeterCotes = arrayOf("a", "b")
        areaCotes = arrayOf("b", "h")
        cotes = mutableMapOf("a" to 0.0, "b" to 0.0, "h" to 0.0)
    }
}

fun defLosange(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.losange
        perimeterFormula = "P = 4c"
        areaFormula = "A = D×d/2"
        perimeterCotes = arrayOf("c")
        areaCotes = arrayOf("d", "D")
        cotes = mutableMapOf("c" to 0.0, "d" to 0.0, "D" to 0.0)
    }
}

fun defCercle(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.cercle
        perimeterFormula = "P = 2πr"
        areaFormula = "A = πr2"
        perimeterCotes = arrayOf("r")
        areaCotes = arrayOf("r")
        cotes = mutableMapOf("r" to 0.0)
    }
}

fun defCarre(formeModel: FormeModel) {
    formeModel.apply {
        imageID = R.drawable.carre
        perimeterFormula = "P = 4c"
        areaFormula = "A = c2"
        perimeterCotes = arrayOf("c")
        areaCotes = arrayOf("c")
        cotes = mutableMapOf("c" to 0.0)
    }
}