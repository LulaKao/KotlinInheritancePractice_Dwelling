package com.quarterlife.car

abstract class Dwelling(private var residents : Int) {
    /*  abstract 為 Kotlin 的關鍵字
    *   是個無法被實體化成物件的抽象類別    */

    abstract val buildingMaterial : String // 建築材質
    abstract val capacity : Int // 容量（容納人數）
    abstract val area : Double // 面積

    fun hasRoom(): Boolean{ // 空房間
        return residents < capacity // 居民人數 < 容納人數
    }

    /*  定義一個抽象函式：
        抽象函式在抽象類別裡可以不用被實作，
        因此抽象函式後方並沒有寫上大括號    */
    abstract fun floorArea(): Double
}