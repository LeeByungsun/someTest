package com.coinplug.wemixwallet.sdk.data;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SendNFT extends SendData{
    @SerializedName("contract")
    private String contract;
    @SerializedName("tokenId")
    private String tokenId;

    public SendNFT(@NonNull String from , @NonNull String to, @NonNull String contract, @NonNull String tokenId){
        super(from,to);
        this.contract = contract;
        this.tokenId = tokenId;
    }

    public String getContract(){
        return contract;
    }

    public void setContract(String contract){
        this.contract = contract;
    }

    public String getTokenId(){
        return tokenId;
    }

    public void setTokenId(String tokenId){
        this.tokenId = tokenId;
    }

    public TransactionData getTransactionData(){
        return  new TransactionData(getFrom(),getTo(), null, contract,tokenId,null,null);
    }
}