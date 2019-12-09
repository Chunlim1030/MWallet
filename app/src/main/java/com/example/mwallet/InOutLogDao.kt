package com.example.mwallet

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface InOutLogDao {
    //suspend is a coroutine function
    @Insert
    suspend fun insertLog(InOutLog: InOutLog)

    @Query("SELECT * FROM _in_out_log")
    suspend fun getLogs(): LiveData<List<InOutLog>>
}