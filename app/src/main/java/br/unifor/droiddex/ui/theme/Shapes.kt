package br.unifor.droiddex.ui.theme

import androidx.compose.foundation.shape.GenericShape

val SemiCircleBottomShape = GenericShape { size, _ ->
    moveTo(0f,0f)
    lineTo(size.width, 0f)
    val curveStartHeight = size.height * 0.7f
    lineTo(size.width, curveStartHeight)
    quadraticTo(
        x1 = size.width / 2f,
        y1 = size.height * 1.1f,
        x2 = 0f,
        y2 = curveStartHeight
    )
    close()
}