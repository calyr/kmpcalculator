package com.calyrsoft.ucbkmp.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Vectors.Proofs: ImageVector
    get() {
        if (_proofs != null) {
            return _proofs!!
        }
        _proofs = Builder(name = "Proofs", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 3.632f)
                curveTo(8.509f, 3.987f, 6.757f, 5.035f, 5.504f, 6.518f)
                lineTo(7.719f, 7.796f)
                curveTo(8.471f, 7.03f, 9.428f, 6.465f, 10.5f, 6.189f)
                verticalLineTo(3.632f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 10.987f, 3.677f, 10.016f, 4.002f, 9.115f)
                lineTo(6.217f, 10.394f)
                curveTo(6.076f, 10.905f, 6.0f, 11.444f, 6.0f, 12.0f)
                curveTo(6.0f, 12.556f, 6.076f, 13.095f, 6.217f, 13.606f)
                lineTo(4.002f, 14.885f)
                curveTo(3.677f, 13.984f, 3.5f, 13.013f, 3.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.504f, 17.482f)
                curveTo(6.757f, 18.965f, 8.509f, 20.014f, 10.5f, 20.368f)
                verticalLineTo(17.811f)
                curveTo(9.428f, 17.535f, 8.471f, 16.97f, 7.719f, 16.204f)
                lineTo(5.504f, 17.482f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.782f, 10.394f)
                curveTo(17.924f, 10.905f, 18.0f, 11.444f, 18.0f, 12.0f)
                curveTo(18.0f, 12.556f, 17.924f, 13.095f, 17.782f, 13.606f)
                lineTo(19.998f, 14.885f)
                curveTo(20.323f, 13.985f, 20.5f, 13.013f, 20.5f, 12.0f)
                curveTo(20.5f, 10.987f, 20.323f, 10.015f, 19.998f, 9.115f)
                lineTo(17.782f, 10.394f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.496f, 6.518f)
                curveTo(17.243f, 5.035f, 15.491f, 3.987f, 13.5f, 3.632f)
                verticalLineTo(6.189f)
                curveTo(14.572f, 6.465f, 15.529f, 7.03f, 16.281f, 7.796f)
                lineTo(18.496f, 6.518f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 17.811f)
                curveTo(14.572f, 17.535f, 15.529f, 16.97f, 16.281f, 16.204f)
                lineTo(18.496f, 17.482f)
                curveTo(17.243f, 18.965f, 15.491f, 20.014f, 13.5f, 20.368f)
                verticalLineTo(17.811f)
                close()
            }
        }
        .build()
        return _proofs!!
    }

private var _proofs: ImageVector? = null
