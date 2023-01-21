package com.example.app1.ui.response

import com.example.app1.model.User

data class LoguinResponse(
    val success: Boolean,
    val user: User,
    val jwt: String
)
