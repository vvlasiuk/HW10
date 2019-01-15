package net.ukr.vlsv.hw10.data

import java.io.Serializable

data class Users (
    val Name: String,
    val FullName: String
) : Serializable
{
    fun getUsers(): ArrayList<Users> {
        val usersList = ArrayList<Users>()
        usersList.add(Users("vvlasiuk", "Vlasiuk Volodimir"))
        usersList.add(Users("KhomchenkoAlex", "Khomchenko Alex"))
        usersList.add(Users("andrey241991", "Andrey"))
        usersList.add(Users("Mayada", "mayada1994"))
        usersList.add(Users("olyadowgal", "Dowgal Olya"))

        return usersList
    }

}

