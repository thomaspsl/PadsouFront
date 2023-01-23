package com.example.padsou.ui.theme

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun Test(id: String?) {
    Row(
        modifier = Modifier.background(Color.Blue)
    ) {
        Text(text = "Ici on test $id")
        /*val db = Firebase.firestore

        db.collection("bon_plan")
            .get()
            .addOnSuccessListener { result ->
                Log.d("tag", "docsss")
                for (document in result) {
                    Log.d("tag", "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("tag", "Error getting documents: ", exception)
            }*/

    }
}

