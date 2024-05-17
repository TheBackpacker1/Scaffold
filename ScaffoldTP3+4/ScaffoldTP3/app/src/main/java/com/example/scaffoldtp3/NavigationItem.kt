package com.example.scaffoldtp3

sealed class NavigationItem {
    object Messages : NavigationItem()
    object Affirmations : NavigationItem()
    object Woof : NavigationItem()
}