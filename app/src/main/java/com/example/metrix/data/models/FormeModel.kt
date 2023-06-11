package com.example.metrix.data.models

import androidx.annotation.DrawableRes
import com.example.metrix.data.enums.FormeName



class FormeModel(name: FormeName) {
    val formeName: FormeName = name
    @DrawableRes
    var imageID: Int = 0
    var cotes: MutableMap<String, Double> = mutableMapOf()
    var perimeterValue: Double = 0.0
    var areaValue: Double = 0.0
    lateinit var perimeterFormula: String
    lateinit var areaFormula: String
    lateinit var perimeterCotes: Array<String>
    lateinit var areaCotes: Array<String>

    init {
        when (name) {
            FormeName.Triangle -> defTriangle(this)
            FormeName.Trapeze -> defTrapeze(this)
            FormeName.Rectangle -> defRectangle(this)
            FormeName.Polygone -> defPolygone(this)
            FormeName.Parallelogramme -> defParallelogramme(this)
            FormeName.Losange -> defLosange(this)
            FormeName.Cercle -> defCercle(this)
            FormeName.Carre -> defCarre(this)
        }
    }

}
