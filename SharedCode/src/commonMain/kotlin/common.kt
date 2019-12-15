package com.salam.crosstaxi


expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

data class UserProfile(
    var name: String = "",
    var emailAddress: String = "",
    var dob: String = "",
    var fullName: String = "")

