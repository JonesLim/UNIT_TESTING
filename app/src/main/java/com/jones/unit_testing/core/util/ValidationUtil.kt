package com.jones.unit_testing.core.util

object ValidationUtil {
    fun validateEmail(email: String): Boolean {
        val reg = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z0-9.]+$")
        return reg.matches(email)
    }
}
