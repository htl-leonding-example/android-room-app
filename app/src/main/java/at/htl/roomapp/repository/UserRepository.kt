package at.htl.roomapp.repository

import androidx.lifecycle.LiveData
import at.htl.roomapp.data.UserDao
import at.htl.roomapp.model.User

class UserRepository(private val userDao: UserDao) {
    val readAlldata:  LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }
}