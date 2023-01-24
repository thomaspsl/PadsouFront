package com.example.padsou.Models

import android.app.Activity
import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.padsou.data.Tips
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObjects
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

// ViewModel : voir homeViewModel
class AuthViewModel: ViewModel() {


// login
fun login(email:String,password:String,navController: NavController){
        Firebase.auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("user", task.result.user?.uid ?:"")
                    val user = Firebase.auth.currentUser
                    Log.d("user","Identifiant : {${user?.uid}}")
                    navController.navigate("home")

                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("user", "signInWithEmail:failure", task.exception)
                    //updateUI(null)
                }
            }

}
/**/



fun register(mail:String,password:String,navController: NavController){
    Firebase.auth.createUserWithEmailAndPassword(mail, password)
        .addOnCompleteListener() { task ->
            if (task.isSuccessful) {
                // Sign in success, update UI with the signed-in user's information
                Log.d(TAG, "createUserWithEmail:success")
                navController.navigate("login")

                //updateUI(user)
            } else {
                // If sign in fails, display a message to the user.
                Log.w(TAG, "createUserWithEmail:failure", task.exception)
                //updateUI(null)
            }
        }
}


}