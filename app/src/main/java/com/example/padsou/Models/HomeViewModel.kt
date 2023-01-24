package com.example.padsou.Models

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.padsou.data.Category
import com.example.padsou.data.Tips
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
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
        getCategorie()
    }

    private fun getTips() {
        val db = Firebase.firestore
        db.collection("plan")
            .get()
            .addOnSuccessListener { result ->
                _tips.value = result.toObjects()
            }
        .addOnFailureListener { exception ->
            Log.d("tag", "Error getting documents: ", exception)
        }
    }

    private val _categorie = MutableStateFlow<List<Category>>(listOf())
    val category = _categorie.asStateFlow()
    private fun getCategorie() {
        val db = Firebase.firestore
        db.collection("categorie")
            .get()
            .addOnSuccessListener { result ->
                _categorie.value = result.toObjects()
            }
            .addOnFailureListener { exception ->
                Log.d("tag", "Error getting documents: ", exception)
            }
    }

     @SuppressLint("SuspiciousIndentation")
     fun addTips(description:String = "", image:String = "", lien:String = "", titre:String ="", navController: NavController){
        val newTips = Tips(description,image,titre,lien,"123")
        val newTips2 = hashMapOf(
            "description" to description,
            "image" to image,
            "lien" to lien,
            "titre" to titre
        )
         val db = Firebase.firestore

            db.collection("plan")
                .add(newTips)
            .addOnSuccessListener{
                navController.navigate("login")
            }
                .addOnFailureListener{
                    Log.d("error",it.localizedMessage)
                }
    }
}