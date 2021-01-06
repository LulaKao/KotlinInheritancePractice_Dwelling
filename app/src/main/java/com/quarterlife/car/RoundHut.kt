package com.quarterlife.car

import kotlin.math.PI

/*  [關鍵字 open ]
    在Kotlin 中我們稱 RoundHut 、SquareCabin 為終端類別（final class）
    代表他是一個最後的類別，是無法被繼承的。
    而除了抽象類別以外的類別，預設都是 final class。
    因此如果要繼續繼承 RoundHut 類別，需要在定義類別前加上 open 這個關鍵字 */
open class RoundHut(residents : Int, private val radius : Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4
    override var area = 0.0

    override fun floorArea(): Double {
        area = radius * radius * PI
        return area
    }
}