package com.example.showtimecollection.network;

import com.example.showtimecollection.models.EmployeeRes;
import com.example.showtimecollection.models.TestRes;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebCalls {

    @GET(EndPoints.TEST)
    Call<TestRes> test();

    @GET(EndPoints.REGISTRATION)
    Call<EmployeeRes> Register(@Query("cell") String cell);

}
