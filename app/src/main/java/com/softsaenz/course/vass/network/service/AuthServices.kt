package com.softsaenz.course.vass.network.service

import com.softsaenz.course.vass.network.service.db.LoginDto
import com.softsaenz.course.vass.network.service.db.TokenDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthServices {
 /**
  * @author Janes Saenz
  * 19/10/21.
  */
 @POST("auth")
 suspend fun login(@Body loginDto: LoginDto): Response<TokenDto>
}