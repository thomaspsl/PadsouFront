package com.example.padsou

// ViewModel : voir homeViewModel

// login
auth.signInWithEmailAndPassword(email, password)
.addOnCompleteListener(this) { task ->
    if (task.isSuccessful) {
        // Sign in success, update UI with the signed-in user's information
        Log.d(TAG, "signInWithEmail:success")
        val user = auth.currentUser
        updateUI(user)
    } else {
        // If sign in fails, display a message to the user.
        Log.w(TAG, "signInWithEmail:failure", task.exception)
        Toast.makeText(baseContext, "Authentication failed.",
            Toast.LENGTH_SHORT).show()
        updateUI(null)
    }
}


EmailPasswordActivity.kt


// register