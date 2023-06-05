package com.example.metrix.data.models

import androidx.annotation.DrawableRes
import com.example.metrix.data.enums.FigureName

 open class Figure(
  @DrawableRes val imageID: Int,
  val name: FigureName,
  val perimeterFormula: String,
  val areaFormula: String,
 )
