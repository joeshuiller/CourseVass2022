package com.softsaenz.course.vass.utils

interface AlertService {
    fun createAlert(messages: String, title: String)
    fun  displayLoadingWithText(text: String?, cancelable: Boolean)
    fun hideLoading()
}