package com.quarterlife.car

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val squareCabin = SquareCabin(6, 50.0)
        val roundHut = RoundHut(6, 3.0)
        val roundTower = RoundTower(4,4, 15.5)

        // 大括號內以 squareCabin 為操作目標
        with(squareCabin){
            println("=========\nSquare Cabin\n=========")
            println("Capacity: $capacity") // 獲取成員時可省略物件名稱：squareCabin.capacity
            println("Material: $buildingMaterial") // 獲取成員時可省略物件名稱：squareCabin.buildingMaterial
            println("Has room? ${hasRoom()}") // 使用成員時可省略物件名稱：squareCabin.hasRoom()
            println("Floor area: ${floorArea()}") // 使用成員時可省略物件名稱：squareCabin.floorArea()
        }

        // 大括號內以 roundHut 為操作目標
        with(roundHut){
            println("=========\nRound Hut\n=========")
            println("Capacity: $capacity") // 獲取成員時可省略物件名稱：roundHut.capacity
            println("Material: $buildingMaterial") // 獲取成員時可省略物件名稱：roundHut.buildingMaterial
            println("Has room? ${hasRoom()}") // 使用成員時可省略物件名稱：roundHut.hasRoom()
            println("Floor area: ${floorArea()}") // 使用成員時可省略物件名稱：roundHut.floorArea()
        }

        // 大括號內以 roundHut 為操作目標
        with(roundTower){
            println("=========\nRound Tower\n=========")
            println("Capacity: $capacity") // 獲取成員時可省略物件名稱：roundTower.capacity
            println("Material: $buildingMaterial") // 獲取成員時可省略物件名稱：roundTower.buildingMaterial
            println("Has room? ${hasRoom()}") // 使用成員時可省略物件名稱：roundTower.hasRoom()
            println("Floor area: ${floorArea()}") // 使用成員時可省略物件名稱：roundTower.floorArea()
        }
    }
}