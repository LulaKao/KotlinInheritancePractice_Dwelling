package com.quarterlife.car

class SquareCabin(residents : Int, private val length : Double) : Dwelling(residents) {
    /*  Dwelling 的抽象成員必須在子類別中被實作  */
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override var area = 0.0

    override fun floorArea(): Double {
        area = length * length
        return area
    }
}