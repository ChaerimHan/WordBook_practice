package com.example.wordbook.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


//쿼리문
@Dao
interface WordDao {
    @Insert
    suspend fun insert(word: Word): Long

    @Update
    suspend fun update(word: Word): Int

    @Query("select * from words")
    fun selectAllWithLiveData(): LiveData<List<Word>>

    @Query("select * from words")
    suspend fun selectAll(): List<Word>

    @Query("select * from words WHERE id = :id")
    suspend fun findById(id: Int): Word

    @Query("select count(*) from words")
    suspend fun getCount(): Int
    //SQL쿼리문 저장해두고 함수로 만든거 !!

/*
    @Query("SELECT category FROM words WHERE english LIKE :searchQuery")
    fun searchEngCategory(searchQuery : String) : List<Word>

    @Query("SELECT category FROM words WHERE means LIKE :searchQuery")
    fun searchMeanCategory(searchQuery : String) : List<Word>
*/
}