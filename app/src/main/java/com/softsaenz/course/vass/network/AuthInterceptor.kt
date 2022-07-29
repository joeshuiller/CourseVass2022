package com.softsaenz.course.vass.network

import com.softsaenz.course.vass.utils.AUTHORIZATION
import com.softsaenz.course.vass.utils.storage.Storage
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private  val  storege: Storage): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        val token = storege.getToken()
        if (token.isNotEmpty()){
            request.addHeader(AUTHORIZATION, "Bearer $token")
        }
        return chain.proceed(request.build())
    }
}