package br.com.myproject.api;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("target_code")
    private String targetCode;

    @SerializedName("conversion_rate")
    private double conversionRate;

    @SerializedName("conversion_result")
    private double conversionResult;

    @SerializedName("time_last_update_utc")
    private String timeLastUpdate;

    @SerializedName("time_next_update_utc")
    private String timeNextUpdate;

    public String getBaseCode() {
        return baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public double getConversionResult() {
        return conversionResult;
    }

    public String getTimeLastUpdate() {
        return timeLastUpdate;
    }

    @Override
    public String toString() {
        return "Result{" +
                "baseCode='" + baseCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", conversionRate=" + conversionRate +
                ", conversionResult=" + conversionResult +
                ", timeLastUpdate='" + timeLastUpdate + '\'' +
                ", timeNextUpdate='" + timeNextUpdate + '\'' +
                '}';
    }
}
