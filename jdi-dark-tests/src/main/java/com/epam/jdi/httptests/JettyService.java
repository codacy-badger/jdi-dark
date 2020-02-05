package com.epam.jdi.httptests;

import com.epam.http.annotations.ContentType;
import com.epam.http.annotations.DELETE;
import com.epam.http.annotations.GET;
import com.epam.http.annotations.Header;
import com.epam.http.annotations.Headers;
import com.epam.http.annotations.POST;
import com.epam.http.annotations.PUT;
import com.epam.http.annotations.QueryParameter;
import com.epam.http.annotations.QueryParameters;
import com.epam.http.annotations.ServiceDomain;
import com.epam.http.requests.RestMethod;

import static io.restassured.http.ContentType.JSON;
import static io.restassured.http.ContentType.TEXT;
import static io.restassured.http.ContentType.URLENC;

@ServiceDomain("http://localhost:8080/")
public class JettyService {

    @GET("/multiCookie")
    public static RestMethod getMultiCookie;

    @GET("/setCookies")
    public static RestMethod setCookies;

    @GET("/cookie")
    public static RestMethod getCookie;

    @PUT("/cookie")
    public static RestMethod putCookie;

    @POST("/reflect")
    public static RestMethod<Hello> postReflect;

    @GET("/setCommonIdCookies")
    public static RestMethod getCommonIdCookies;

    @GET("/header")
    @Header(name = "HeaderTestName", value = "HeaderTestValue")
    public static RestMethod getWithSingleHeaderInRequest;

    @GET("/header")
    @Headers({
            @Header(name = "Header1", value = "Value1"),
            @Header(name = "Header2", value = "Value2")
    })
    public static RestMethod getWithMultipleHeadersInRequest;

    @DELETE("/cookie")
    public static RestMethod deleteCookie;

    @GET("/greet")
    public static RestMethod getGreet;

    @DELETE("/greet")
    public static RestMethod deleteGreet;

    @DELETE("/body")
    @ContentType(TEXT)
    public static RestMethod deleteBody;

    @POST("/greetXML")
    @ContentType(URLENC)
    public static RestMethod postGreetXml;

    @ContentType(JSON)
    @POST("/jsonBody")
    public static RestMethod jsonBodyPost;

    @POST("/secured/hello")
    public static RestMethod unauthorizedPost;

    @POST("/cookie")
    public static RestMethod cookiePost;

    @POST("/param-reflect")
    public static RestMethod paramUrlPost;

    @ContentType(TEXT)
    @POST("/body")
    public static RestMethod bodyPost;

    @POST("/greet")
    public static RestMethod greetPost;

    @POST("/notexist")
    public static RestMethod notFoundedURIPost;

    @POST("/header")
    @Header(name = "MyHeader", value = "Something")
    public static RestMethod headerPost;

    @GET("/hello")
    public static RestMethod<Hello> getHello;

    @QueryParameters({
            @QueryParameter(name = "firstName", value = "John"),
            @QueryParameter(name = "lastName", value = "Doe")
    })
    @GET("/greetXML")
    public static RestMethod<Greeting> getGreetXml;

    @GET("/mimeTypeWithPlusJson")
    public static RestMethod<Message> getMimeType;

    @GET("/shopping")
    public static RestMethod getShopping;

    @GET("/products")
    public static RestMethod getProducts;

    @GET("/jsonStore")
    public static RestMethod getJsonStore;

    @GET("/contentTypeAsBody")
    public static RestMethod getContentTypeAsBody;

    @POST("/return204WithContentType")
    @ContentType(JSON)
    public static RestMethod postReturn204WithContentType;

    @GET("/headersWithValues")
    public static RestMethod getHeadersWithValues;

    @GET("/noValueParam")
    public static RestMethod getNoValueParam;

    @GET("/{firstName}/{lastName}")
    public static RestMethod getUser;

    @GET("/{path}.json")
    public static RestMethod getParamBeforePath;

    @GET("/something.{format}")
    public static RestMethod getParamAfterPath;

    @GET("/matrix;{abcde}={value}")
    public static RestMethod getMatrix;

}
