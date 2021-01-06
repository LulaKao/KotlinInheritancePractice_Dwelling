package com.quarterlife.car

class RoundTower(residents : Int, private val floors : Int = 2, private val radius : Double) : RoundHut(residents,radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override var area = 0.0

    override fun floorArea(): Double {
//        area = radius * radius * PI * floors
        area = super.floorArea() * floors
        return area
    }
}