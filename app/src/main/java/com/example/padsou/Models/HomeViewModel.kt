package com.example.padsou

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.padsou.data.Tips
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel: ViewModel() {
    private val _tips = MutableStateFlow<List<Tips>>(listOf())
    val tips = _tips.asStateFlow()

    init {
        getTips()
    }

    private fun getTips() {
        val db = Firebase.firestore
        db.collection("bon_plan")
            .get()
            .addOnSuccessListener { result ->
                _tips.value = result.toObjects()
            }
        .addOnFailureListener { exception ->
            Log.d("tag", "Error getting documents: ", exception)
        }
    }
}