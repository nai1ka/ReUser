package ru.ndevelop.reuser

import ru.ndevelop.reuser.utils.Action

data class Tag(val name: String = "",val tagId:String) {
    var actions: ArrayList<Action> = arrayListOf()
    var isExpanded = false


}