package com.example.ppapb_sharedpreferenceroom

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.ppapb_sharedpreferenceroom.database.DataPemilih
import com.example.ppapb_sharedpreferenceroom.database.DataPemilihDao
import com.example.ppapb_sharedpreferenceroom.database.DataPemilihRoomDatabase

class DataPemilihViewModel(application: Application) : AndroidViewModel(application) {
    private val dao: DataPemilihDao = DataPemilihRoomDatabase.getDatabase(application)!!.pemilihDao()!!
    val allData: LiveData<List<DataPemilih>> = dao.allDataPemilih
}
