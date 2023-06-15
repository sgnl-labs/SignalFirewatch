package com.sgnl.signalfirewatch.servicefacade.rest;

import android.accounts.AccountManager;
import android.os.Bundle;

import androidx.loader.content.AsyncTaskLoader;

import java.net.HttpURLConnection;
import java.net.Authenticator.RequestorType;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class ParticleAPIVerbs extends AsyncTask<String,Integer,String> {
    private static ParticleAPIVerbs _instance;

    private String _user;
    private String _password;
    private String _clientId;
    private String _clientSecret;
    private String _scope;
    private String _callbackUrl;
    private String _loginUrl;

    private static HttpsURLConnection _getTokenConnection;
    private static final String CLIENT_ID = "signalfirewatch-30";
    private static final String CLIENT_SECRET = "dbc7c4970859210df4ebfb38327ea4fa5a137d8d";

    public static ParticleAPIVerbs getInstance(){
        if( _instance == null ){
            _instance = new ParticleAPIVerbs();
        }
        return(_instance);
    }

    public void backgroundConnect(String user, String password,String clientId, String clientSecret, String scope, String callbackUrl, String getTokenUrl){
        URL url = new URL(getTokenUrl);
        _getTokenConnection = (HttpsURLConnection) url.openConnection();
        _getTokenConnection.setRequestMethod("");
    }
}
