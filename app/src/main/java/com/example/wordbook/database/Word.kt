package com.example.wordbook.database

import androidx.room.Entity
import androidx.room.PrimaryKey

//DB 구축
@Entity(tableName = "words")
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val english: String,
    val means: String,
    val timestamp: String,
    val category: String //추가했음 카테고리분리용 ..
) {
    companion object {
        fun make(english: String, means: String): Word {
            return Word(0, english, means,"", System.currentTimeMillis().toString())
        }//"" 추가함

        fun make(id: Int, english: String, means: String): Word {
            return Word(id, english, means,"", System.currentTimeMillis().toString())
        } //"" 추가함

        fun make(english: String, means: String,category: String): Word {
            return Word(0,english, means,category, System.currentTimeMillis().toString())
        } //make 함수에 카테고리 추가
    }
}