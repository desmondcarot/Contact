package my.tarc.mycontact

import androidx.room.Entity
import androidx.room.PrimaryKey




//entity class
//APP HIERARCHY
//===========
/**
 * UI
 * Viewmodel
 * Repository
 *
 */

//define structure of table
@Entity(tableName = "contact")
data class Contact (val name: String, @PrimaryKey val phone: String) {
    override fun toString(): String {
        return "$name : $phone"
    }
}
