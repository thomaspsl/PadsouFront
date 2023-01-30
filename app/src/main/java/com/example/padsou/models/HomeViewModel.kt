package com.example.padsou.models

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.padsou.data.Category
import com.example.padsou.data.Tips
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
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
            .orderBy("order")
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
         val db = Firebase.firestore

            db.collection("plan")
                .add(newTips)
            .addOnSuccessListener{
                navController.navigate("home")
            }
                .addOnFailureListener{
                    Log.d("error",it.localizedMessage)
                }
    }

    fun getPicturesOfCategoryWithNames(name: String, callback: (String) -> Unit){
        val storageReference = Firebase.storage.reference
        val imagesRef = storageReference.child("imageCategory/")

        imagesRef.child(name).downloadUrl.addOnSuccessListener { it ->
            callback(it.toString())
        }
            .addOnFailureListener { ex -> Log.e("image error :", ex.toString()) }

    }

    fun getPicturesOfTipsWithNames(name: String, callback: (String) -> Unit){
        val storageReference = Firebase.storage.reference
        val imagesRef = storageReference.child("imagePlan/")

        imagesRef.child(name).downloadUrl.addOnSuccessListener { it ->
            callback(it.toString())
        }
            .addOnFailureListener { ex -> Log.e("image error :", ex.toString()) }

    }

    //val stream = FileInputStream(File("path/to/images/rivers.jpg"))
}